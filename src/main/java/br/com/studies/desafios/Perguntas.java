package br.com.studies.desafios;

import com.google.gson.*;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Perguntas {

     static void mostrarPerguntas() {
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

            Pessoa pessoa = new Pessoa(answers.getFirst(), answers.get(1), Integer.parseInt(answers.get(2)), Integer.parseInt(answers.get(3)));


            for(String answer : answers) {
                System.out.println(answer);
            }

            String arquivoGerado = salvarRespostasJson(answers);

            System.out.println("Respostas salvas em " + arquivoGerado);
            System.out.println("Objeto Pessoa criado: " +
                    "Nome:" + pessoa.nome() + ", " +
                    "Email: " + pessoa.email() + ", " +
                    "Idade: " + pessoa.idade() + ", " +
                    "Altura: " + pessoa.altura());

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
}
