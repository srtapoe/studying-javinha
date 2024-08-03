package br.com.studies.listadesafios;

import java.util.Scanner;
import java.util.TreeSet;

public class ExercicioDez {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);

        String nota;
        TreeSet<Double> notas = new TreeSet<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Nota: ");
            nota = dadosEntrada.next();

            nota = nota.replace(",", ".");
            double notaTransformada = Double.parseDouble(nota);

            notas.add(notaTransformada);
        }

        double soma = notas
                .stream()
                .mapToDouble(Double::doubleValue)
                .sum();

        double media = soma / notas.size();

        System.out.printf("Média das notas: %.1f%n", media);

        dadosEntrada.close();
    }
}
