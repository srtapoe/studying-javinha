package br.com.studies.listadesafios.partedois;

import java.util.Scanner;

public class ExercicioDezessete {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        System.out.println("Temperatura em Fahrenheit: ");
        double temperaturaFahrenheit = dadosEntrada.nextDouble();

        calculoConversaoFahrenheitToCelsius(temperaturaFahrenheit);
    }

    static void calculoConversaoFahrenheitToCelsius(double temperaturaFahrenheit) {
        double temperaturaCelsius = (5 * (temperaturaFahrenheit - 32) / 9) ;
        System.out.println("A temperatura em Fahrenheit de " + temperaturaFahrenheit +
                " convertida para Celsius eh de: " + temperaturaCelsius + "°");
    }
}
