package br.com.studies.listadesafios.partedois;

import java.util.Scanner;

public class ExercicioDoze {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);

        System.out.println("Valor do produto: ");
        String valorProduto = dadosEntrada.next();

        valorProduto = valorProduto.replace(",", ".");
        double valorProdutoTransformado = Double.parseDouble(valorProduto);

        String menu = """
            Escolha a forma de pagamento:
            1. À Vista em Dinheiro ou Pix (15% de desconto)
            2. À Vista no cartao de credito (10% de desconto)
            3. Parcelado no cartao em duas vezes (sem juros)
            4. Parcelado no cartao em tres vezes ou mais (10% de juros)
            """;

        System.out.println(menu);
        System.out.print("Digite o código da forma de pagamento: ");
        int formaDePagamento = dadosEntrada.nextInt();
        calculaPagamento(formaDePagamento, valorProdutoTransformado);
    }

    static void calculaPagamento(int formaDePagamento, double valorProduto){
        double valorFinal = switch (formaDePagamento) {
            case 1 -> valorProduto * 0.85;
            case 2 -> valorProduto * 0.90;
            case 3 -> valorProduto;
            case 4 -> valorProduto * 1.10;
            default -> {
                System.out.println("Código de pagamento inválido.");
                yield 0;
            }
        };
        if (valorFinal != 0) {
            System.out.printf("O valor final do produto a ser pago é: R$ %.2f%n", valorFinal);
        }
    }
}
