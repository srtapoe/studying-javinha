package br.com.studies.listadesafios.partedois;

public class ExercicioDezenove {
    public static void main(String[] args) {

        mostrarTabuada();
    }

    static void mostrarTabuada(){
        for(int j = 1; j <= 10; j++){
            System.out.println("Tabuada do numero " + j);
            for(int i = 1; i <= 10; i++){
                int multiplicacao = j * i;
                System.out.println(j + " x " + i + " = " + multiplicacao);
            }
            System.out.println();
        }
    }
}
