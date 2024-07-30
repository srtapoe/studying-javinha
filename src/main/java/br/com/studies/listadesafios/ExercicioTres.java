package br.com.studies.listadesafios;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num1 = dadosEntrada.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = dadosEntrada.nextInt();

       mostrarResultado(num1, num2);
    }

    static void mostrarResultado(int num1, int num2){
        int soma = num1 + num2;
        int multiplicacao = num1 * num2;

        int resultado = (num1 == num2) ? soma : multiplicacao;

        System.out.println(resultado);
    }
}
