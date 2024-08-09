package br.com.studies.desafios;

import com.google.gson.*;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static br.com.studies.desafios.UsuarioFuncionalidades.*;

public class Pergunta {
    private static final String QUESTIONS_FILE = "formulario.json";
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    static void mostrarMenu(Scanner dadosEntrada) throws IOException {
        while (true) {
            String menu = """
                    Menu:
                    1 - Cadastrar o usuário
                    2 - Listar todos usuários cadastrados
                    3 - Cadastrar nova pergunta no formulário
                    4 - Deletar pergunta do formulário
                    5 - Pesquisar usuário por nome, idade ou email
                    6 - Sair
                    """;
            System.out.println(menu);
            int choice = dadosEntrada.nextInt();
            dadosEntrada.nextLine();

            switch (choice) {
                case 1:
                    cadastrarUsuario(dadosEntrada);
                    break;
                case 2:
                    listarUsuarios();
                    break;
                case 3:
                    cadastrarPergunta(dadosEntrada);
                    break;
                case 4:
                    deletarPergunta(dadosEntrada);
                    break;
                case 5:
                    pesquisarUsuario(dadosEntrada);
                    break;
                case 6:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void deletarPergunta(Scanner dadosEntrada) throws IOException {
        List<String> questions = lerQuestoes();
        for (int i = 0; i < questions.size(); i++) {
            System.out.println((i + 1) + " - " + questions.get(i));
        }
        System.out.println("Digite o número da pergunta a ser deletada:");
        int index = dadosEntrada.nextInt();
        dadosEntrada.nextLine();

        if(index >= 1 && index <= 4) {
            System.out.println("Você não pode deletar as 4 primeiras perguntas");
        }

        if (index >= 5 && index <= questions.size()) {
            questions.remove(index - 1);
            salvarQuestao(questions);
            System.out.println("Pergunta n° " + index + " deletada com sucesso!");
        } else if(index > questions.size()) {
            System.out.println("Índice inválido!");
        }
    }

    private static void cadastrarPergunta(Scanner dadosEntrada) throws IOException {
        System.out.println("Digite a nova pergunta:");
        String novaPergunta = dadosEntrada.nextLine();
        List<String> questions = lerQuestoes();
        questions.add(novaPergunta);
        salvarQuestao(questions);
        System.out.println("Pergunta adicionada com sucesso!");
    }

    private static void salvarQuestao(List<String> questions) throws IOException {
        try (FileWriter file = new FileWriter(QUESTIONS_FILE)) {
            JsonObject jsonObject = new JsonObject();
            JsonArray questionsArray = new JsonArray();
            for (String question : questions) {
                questionsArray.add(question);
            }
            jsonObject.add("perguntas", questionsArray);
            gson.toJson(jsonObject, file);
        }
    }

    private static List<String> lerQuestoes() throws IOException {
        try (FileReader reader = new FileReader(QUESTIONS_FILE)) {
            JsonObject jsonObject = JsonParser.parseReader(reader).getAsJsonObject();
            JsonArray questionsArray = jsonObject.getAsJsonArray("perguntas");
            List<String> questions = new ArrayList<>();
            for (int i = 0; i < questionsArray.size(); i++) {
                questions.add(questionsArray.get(i).getAsString());
            }
            return questions;
        }
    }
}
