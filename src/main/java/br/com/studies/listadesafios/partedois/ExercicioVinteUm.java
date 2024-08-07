package br.com.studies.listadesafios.partedois;

import java.util.Random;

public class ExercicioVinteUm {
    public static void main(String[] args) {
        Random numeroRandomico = new Random();

        System.out.println("Seu numero da sorte eh " + numeroRandomico.nextInt(100));
    }
}
