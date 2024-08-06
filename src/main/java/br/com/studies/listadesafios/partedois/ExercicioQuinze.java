package br.com.studies.listadesafios.partedois;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ExercicioQuinze {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);

        System.out.println("Digite o dia do seu nascimento: ");
        int diaNascimento = dadosEntrada.nextInt();
        System.out.println("Digite o mês do seu nascimento: ");
        int mesNascimento = dadosEntrada.nextInt();
        System.out.println("Digite o ano de seu nascimento: ");
        int anoNascimento = dadosEntrada.nextInt();

        mostrarIdadeEmDetalhes(anoNascimento, mesNascimento, diaNascimento);
    }

    static void mostrarIdadeEmDetalhes(int anoNascimento, int mesNascimento, int diaNascimento){
        LocalDate dataNascimentoCompleta = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
        LocalDate dataAtual = LocalDate.now();

        Period diferenca = Period.between(dataNascimentoCompleta, dataAtual);

        int anos = diferenca.getYears();
        int meses = diferenca.getMonths();
        int dias = diferenca.getDays();

        System.out.println("Seu tempo de vida vivido eh:\n" +
                "1. Em anos: " + anos + "\n" +
                "2. Em meses: " + meses + "\n" +
                "3. Em dias: " + dias + "\n");
    }
}
