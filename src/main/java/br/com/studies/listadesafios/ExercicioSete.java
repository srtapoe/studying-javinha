package br.com.studies.listadesafios;

import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        boolean valorUm = dadosEntrada.nextBoolean();

        System.out.println("Digite outro valor: ");
        boolean valorDois = dadosEntrada.nextBoolean();

        mostrarResultadoLogico(valorUm, valorDois);
    }

    static void mostrarResultadoLogico(boolean valorUm, boolean valorDois) {
        boolean resultadoVerdadeiro = valorUm && valorDois;

        String resultado = resultadoVerdadeiro ? "Verdadeiro" : "Falso";

        System.out.println(resultado);

    }
}
