package br.com.studies.listadesafios.parteum;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        System.out.println("Digite o seu peso: ");
        double peso = dadosEntrada.nextDouble();

        System.out.println("Digite o seu altura: ");
        double altura = dadosEntrada.nextDouble();

        calculaImc(peso, altura);
    }

    static void calculaImc(double peso, double altura) {
        double imc = peso / (altura * altura);

        DecimalFormat df = new DecimalFormat("#.00");
        String imcFormatado = df.format(imc);

        if (imc < 18.5) {
            System.out.println("Seu imc eh: " + imcFormatado + "\nAbaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Seu imc eh: " + imcFormatado + "\nPeso ideal (parabéns)");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Seu imc eh: " + imcFormatado + "\nLevemente acima do peso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Seu imc eh: " + imcFormatado + "\nObesidade grau I");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Seu imc eh: " + imcFormatado + "\nObesidade grau II (severa)");
        } else if (imc >= 40.0) {
            System.out.println("Seu imc eh: " + imcFormatado + "\nObesidade grau III (mórbida)");
        } else {
            System.out.println("Valor de IMC inválido");
        }
    }
}

