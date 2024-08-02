package br.com.studies.listadesafios;

import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        String valor = dadosEntrada.next();
        valor = valor.replace(",", ".");
        double valorTransformado = Double.parseDouble(valor);

        mostrarReajuste(valorTransformado);
    }

    static void mostrarReajuste(double valor){
        double reajuste = (valor > 0) ? (valor * 1.05) : valor;
        System.out.println("O valor + 5% de reajuste = " + reajuste);
    }
}
