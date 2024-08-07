package br.com.studies.listadesafios.partedois;

import java.util.Scanner;


public class ExercicioVinteTres {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);

        System.out.println("Valor hora/aula: ");
        double horaAula = dadosEntrada.nextDouble();

        System.out.println("Quantidade de aulas lecionadas: ");
        int quantidadeAulas = dadosEntrada.nextInt();

        System.out.println("Percentual de desconto do INSS");
        double percentualDesconto = dadosEntrada.nextDouble();

        calcularSalarioLiquido(horaAula, quantidadeAulas, percentualDesconto);
    }

    static void calcularSalarioLiquido(double horaAula, int quantidadeAulas, double percentualDesconto) {
        double salarioSemDesconto = horaAula * quantidadeAulas;
        double descontoInss = salarioSemDesconto * (percentualDesconto / 100);
        double salarioLiquido = salarioSemDesconto - descontoInss;

        System.out.println("Salario liquido: R$ " + salarioLiquido);
    }
}
