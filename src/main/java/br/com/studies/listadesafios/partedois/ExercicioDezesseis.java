package br.com.studies.listadesafios.partedois;

import java.util.Scanner;

public class ExercicioDezesseis {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        System.out.println("Digite lado 1: ");
        int lado1 = dadosEntrada.nextInt();
        System.out.println("Digite lado 2: ");
        int lado2 = dadosEntrada.nextInt();
        System.out.println("Digite lado 3: ");
        int lado3 = dadosEntrada.nextInt();

        mostrarTipoTriangulo(lado1, lado2, lado3);
    }

    static void mostrarTipoTriangulo(int lado1, int lado2, int lado3) {
        boolean trianguloEquilateral = (lado1 == lado2 && lado2 == 3);
        boolean trianguloIsoceles = (lado1 == lado2 || lado1 == lado3 || lado2 == lado3);

        if(trianguloEquilateral) {
            System.out.println("Equilateral");
        }else if(trianguloIsoceles) {
            System.out.println("Isoceles");
        }else{
            System.out.println("Escaleno");
        }
    }
}
