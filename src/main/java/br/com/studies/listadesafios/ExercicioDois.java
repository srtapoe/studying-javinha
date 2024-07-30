package br.com.studies.listadesafios;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = dadosEntrada.nextInt();

        mostrarResultado(numero);
    }

    static void mostrarResultado(int numero) {
        String parOuImpar = (numero % 2 == 0) ? "Par" : "Impar";
        String positivoOuNegatiovo = (numero >= 0) ? "Positivo" : "Negativo";

        System.out.println(parOuImpar);
        System.out.println(positivoOuNegatiovo);
    }
}
