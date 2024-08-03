package br.com.studies.listadesafios.parteum;

import java.util.Scanner;
import java.util.TreeSet;

public class ExercicioOnze {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);

        String nota;
        TreeSet<Double> notas = new TreeSet<>();

        System.out.println("Nome do aluno(a): ");
        String nome = dadosEntrada.nextLine();

        for (int i = 0; i < 4; i++) {
            System.out.println("Nota: ");
            nota = dadosEntrada.next();

            nota = nota.replace(",", ".");
            double notaTransformada = Double.parseDouble(nota);

            notas.add(notaTransformada);
        }

        mostrarStatusAluno(notas, nome);
    }

    static void mostrarStatusAluno(TreeSet<Double> notas, String nome) {
        double soma = notas
                .stream()
                .mapToDouble(Double::doubleValue)
                .sum();

        double media = soma / notas.size();


        String resultado = (media >= 7) ? "aprovado" : "reprovado";


        System.out.printf("%s, você foi %s com media %.1f%n", nome, resultado, media);
    }
}
