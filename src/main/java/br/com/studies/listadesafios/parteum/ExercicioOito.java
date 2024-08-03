package br.com.studies.listadesafios.parteum;

import java.util.Scanner;
import java.util.TreeSet;

public class ExercicioOito {

    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        int numero;
        TreeSet<Integer> numeros = new TreeSet<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Numero: ");
            numero = dadosEntrada.nextInt();

            numeros.add(numero);
        }
        numeros.forEach(System.out::println);
    }
}
