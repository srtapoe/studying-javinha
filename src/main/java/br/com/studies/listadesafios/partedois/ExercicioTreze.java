package br.com.studies.listadesafios.partedois;

import java.util.Scanner;

public class ExercicioTreze {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = dadosEntrada.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = dadosEntrada.nextInt();

        mostrarDados(nome, idade);
    }

    static void mostrarDados(String nome, int idade){
        String ehMaiorDeIdade = (idade>= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println(nome + " eh " + ehMaiorDeIdade);
    }
}
