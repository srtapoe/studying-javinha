package br.com.studies.listadesafios.parteum;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = dadosEntrada.nextInt();

        mostrarSucessorAntecessor(numero);
    }

    static void mostrarSucessorAntecessor(int numero){
        int antecessor = (numero > 0) ? numero - 1: numero;
        int sucessor = (numero > 0) ? numero + 1 : numero;

        System.out.println("Antecessor do numero " + numero + ": " + antecessor);
        System.out.println("Sucessor do numero " + numero + ": " + sucessor);
    }
}
