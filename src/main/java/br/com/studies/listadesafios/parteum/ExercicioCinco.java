package br.com.studies.listadesafios.parteum;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);

        System.out.println("Digite o valor do salario  minimo: ");
        BigDecimal salarioMinimo = dadosEntrada.nextBigDecimal();

        System.out.println("Digite o valor do salario a ser analisado: ");
        BigDecimal salarioUsuario = dadosEntrada.nextBigDecimal();

        mostarQuantidadeSalariosMinimos(salarioMinimo, salarioUsuario);
    }

    static void mostarQuantidadeSalariosMinimos(BigDecimal salarioMinimo, BigDecimal salarioUsuario) {
        BigDecimal quantidadeSalariosMinimo;

        try{
            quantidadeSalariosMinimo = salarioUsuario.divide(salarioMinimo, RoundingMode.CEILING);
            System.out.println("Quantidade de salarios minimos no salario informado: " + quantidadeSalariosMinimo);
        }catch (ArithmeticException ex){
            System.out.println("O valor de salario minimo não pode ser negativo ou igual a zero!");
        }
    }
}
