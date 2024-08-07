package br.com.studies.listadesafios.partedois;

public class ExercicioDezoito {
    public static void main(String[] args) {

        double alturaFrancisco = 1.50;
        double taxaFrancisco = 0.02;

        double alturaSara = 1.60;
        double taxaSara = 0.03;

        calcularAnos(alturaFrancisco, taxaFrancisco, alturaSara, taxaSara);
    }

    static void calcularAnos(double alturaFrancisco, double taxaFrancisco, double alturaSara, double taxaSara) {
        int anos = 0;

        if (alturaFrancisco > alturaSara) {
            System.out.println("Francisco já é maior que Sara.");
            return;
        }

        if (taxaFrancisco <= taxaSara) {
            System.out.println("Francisco nunca será maior que Sara com as taxas de crescimento atuais.");
            return;
        }

        while(alturaFrancisco <= alturaSara) {
            alturaFrancisco+= taxaFrancisco;
            alturaSara+= taxaSara;
            anos ++;
        }
        System.out.println("Anos de crescimento necessarios para que Francisco seja maior que Sara: " + anos);
    }
}
