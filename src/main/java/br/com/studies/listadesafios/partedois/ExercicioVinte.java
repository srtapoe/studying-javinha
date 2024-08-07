package br.com.studies.listadesafios.partedois;

import java.util.Scanner;

public class ExercicioVinte {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);

        System.out.println("Numero: ");
        int numero = dadosEntrada.nextInt();

        mostrarTabuada(numero);
    }

    static void mostrarTabuada(int numero) {
        System.out.println("Tabuada do numero " + numero);
        for (int i = 1; i <= 10; i++) {
            int multiplicacao = numero * i;
            System.out.println(numero + " x " + i + " = " + multiplicacao);
        }

    }
}
