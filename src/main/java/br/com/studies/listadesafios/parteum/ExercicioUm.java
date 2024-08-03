package br.com.studies.listadesafios.parteum;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        int numeroA, numeroB, numeroC;

        System.out.println("Número A: ");
        numeroA = dadosEntrada.nextInt();
        System.out.println("Número B: ");
        numeroB = dadosEntrada.nextInt();
        System.out.println("Numero C: ");
        numeroC = dadosEntrada.nextInt();

        mostrarResultado(numeroA, numeroB, numeroC);

    }


    static void mostrarResultado(int numeroA, int numeroB, int numeroC){
        int somaAeB = numeroA + numeroB;

        String resultado = (somaAeB < numeroC) ? "A soma de A + B  eh menor" : "A soma de A + B nao eh menor que C";

        System.out.println(resultado);
    }
}
