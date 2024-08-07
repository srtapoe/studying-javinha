package br.com.studies.listadesafios.partedois;

import java.util.Scanner;

public class ExercicioVinteQuatro {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);

        System.out.println("Digite o tempo da viagem (em horas): ");
        double tempo = dadosEntrada.nextDouble();

        System.out.println("Digite a velocidade média (em km/h): ");
        double velocidade = dadosEntrada.nextDouble();

        mostrarDados(tempo, velocidade);
    }

    static void mostrarDados(double tempo, double velocidade) {
        double distancia = tempo * velocidade;
        double litrosUsados = distancia / 12;

        System.out.println("Distancia percorrida: " + distancia + " km");
        System.out.println("Litros usados: " + litrosUsados + " litros");
    }
}
