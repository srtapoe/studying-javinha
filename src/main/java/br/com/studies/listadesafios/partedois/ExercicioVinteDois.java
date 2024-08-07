package br.com.studies.listadesafios.partedois;

import java.util.Scanner;

public class ExercicioVinteDois {
    public static void main(String[] args) {
        Scanner dadosEntrada =  new Scanner(System.in);

        System.out.println("Primeiro numero: ");
        int num1 = dadosEntrada.nextInt();

        System.out.println("Segundo numero: ");
        int num2 = dadosEntrada.nextInt();

        mostrarQuocienteRestoDivisao(num1, num2);
    }

    static void mostrarQuocienteRestoDivisao(int num1, int num2) {
        System.out.println("Quociente: " + (num1 / num2));
        System.out.println("Resto da divisao: " + (num1 % num2));
    }
}
