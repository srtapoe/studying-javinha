package br.com.studies.desafios;

import com.google.gson.*;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsuarioFuncionalidades {
    private static final String USERS_FILE = "usuarios.json";
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    static void cadastrarUsuario(Scanner dadoEntrada) {
        Scanner dadosEntrada = new Scanner(System.in);

        String perguntas = "formulario.json";

        try(FileReader formulario = new FileReader(perguntas)) {

            JsonObject json = JsonParser.parseReader(formulario).getAsJsonObject();
            JsonArray jsonArray = json.getAsJsonArray("perguntas");

            List<String> questions = new ArrayList<>();
            List<String> answers = new ArrayList<>();
            String resposta;

            for (JsonElement jsonElement : jsonArray) {
                questions.add(jsonElement.getAsString());
            }

            System.out.println("Perguntas:");
            for (String question : questions) {
                System.out.println(question);
                resposta = dadosEntrada.nextLine();
                answers.add(resposta);
            }

            Usuario usuario = new Usuario(answers.getFirst(), answers.get(1), Integer.parseInt(answers.get(2)), Integer.parseInt(answers.get(3)));


            for(String answer : answers) {
                System.out.println(answer);
            }

            String arquivoGerado = salvarRespostasJson(answers);

            System.out.println("Respostas salvas em " + arquivoGerado);
            List<Usuario> usuarios = readUsuarios();
            usuarios.add(usuario);
            salvarUsuario(usuarios);
            System.out.println("Usuário cadastrado com sucesso!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static String salvarRespostasJson(List<String> answers) throws IOException {
        JsonObject respostaJson = new JsonObject();
        JsonArray respostaArray = new JsonArray();

        for(String answer : answers) {
            respostaArray.add(answer);
        }
        respostaJson.add("answers", respostaArray);

        String userName = answers.getFirst().toUpperCase();
        String userNameModified = userName.replace(" ", "_");
        String outputFileName = userNameModified + ".json";
        try (FileWriter file = new FileWriter(outputFileName)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(respostaJson, file);
        }
        return outputFileName;
    }

    static void listarUsuarios(){
        List<Usuario> usuarios = readUsuarios();
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            for (Usuario usuario : usuarios) {
                System.out.println("Nome: " + usuario.nome());
            }
        }
    }

    static void pesquisarUsuario(Scanner dadosEntrada){
        System.out.println("Em breve!");
    }

    private static List<Usuario> readUsuarios() {
        try (FileReader reader = new FileReader(USERS_FILE)) {
            JsonArray jsonArray = JsonParser.parseReader(reader).getAsJsonArray();
            List<Usuario> usuarios = new ArrayList<>();
            for (int i = 0; i < jsonArray.size(); i++) {
                JsonObject jsonObject = jsonArray.get(i).getAsJsonObject();
                Usuario usuario = gson.fromJson(jsonObject, Usuario.class);
                usuarios.add(usuario);
            }
            return usuarios;
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    private static void salvarUsuario(List<Usuario> usuarios) {
        try (FileWriter file = new FileWriter(USERS_FILE)) {
            JsonArray jsonArray = new JsonArray();
            for (Usuario usuario : usuarios) {
                JsonObject jsonObject = (JsonObject) gson.toJsonTree(usuario);
                jsonArray.add(jsonObject);
            }
            gson.toJson(jsonArray, file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
