package br.com.studies.desafios;

import java.util.Scanner;

import static br.com.studies.desafios.UsuarioFuncionalidades.*;

public class Pergunta {

    static void mostrarMenu(Scanner dadosEntrada) {
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

    private static void deletarPergunta(Scanner dadosEntrada) {
        System.out.println("Em breve!");
    }

    private static void cadastrarPergunta(Scanner dadosEntrada) {
        System.out.println("Em breve!");
    }
}
