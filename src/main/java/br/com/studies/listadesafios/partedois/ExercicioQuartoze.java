package br.com.studies.listadesafios.partedois;

import java.util.Scanner;

public class ExercicioQuartoze {
    public static void main(String[] args) {

        Scanner dadosEntrada = new Scanner(System.in);

        System.out.println("Digite o valor A: ");
        int valorA = dadosEntrada.nextInt();
        System.out.println("Digite o valor B: ");
        int valorB = dadosEntrada.nextInt();

        int valorC = valorB;
        valorB = valorA;


        System.out.println("Valor A = " + valorC);
        System.out.println("Valor B = " + valorB);
    }
}
