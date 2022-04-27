package vetores;

import java.util.Scanner;

public class Vetores_Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qntProdutos, countAbaixo = 0, countEntre = 0, countAcima = 0;
        double lucro, percentualLucro, valorTotalCompra = 0, valorTotalVenda = 0;

        String nomes[] = new String[9];
        double precoCompra[] = new double[9];
        double precoVenda[] = new double[9];

        System.out.println("Serão digitados dados de quantas mercadorias?");
        qntProdutos = entrada.nextInt();

        for (int i = 0; i < qntProdutos; i++) {
            System.out.println("Produto " + (i + 1) + ":");
            System.out.println("Nome:");
            entrada.nextLine();
            nomes[i] = entrada.nextLine();
            System.out.println("Preço de compra:");
            precoCompra[i] = entrada.nextDouble();
            ;
            System.out.println("Preço de venda:");
            precoVenda[i] = entrada.nextDouble();
        }

        for (int i = 0; i < qntProdutos; i++) {
            lucro = precoVenda[i] - precoCompra[i];
            percentualLucro = (lucro * 100) / precoCompra[i];

            if (percentualLucro < 10) {
                countAbaixo += 1;
            } else if (percentualLucro >= 10 && percentualLucro <= 20) {
                countEntre += 1;
            } else {
                countAcima += 1;
            }
        }

        System.out.println("Lucro abaixo de 10%: " + countAbaixo);
        System.out.println("Lucro entre 10% e 20%: " + countEntre);
        System.out.println("Lucro acima de 20%: " + countAcima);

        for (int i = 0; i < qntProdutos; i++) {
            valorTotalCompra += precoCompra[i];
            valorTotalVenda += precoVenda[i];
        }

        System.out.println("Valor total de compra: " + valorTotalCompra);
        System.out.println("Valor total de venda: " + valorTotalVenda);
        System.out.println("Lucro total: " + (valorTotalVenda - valorTotalCompra));
    }
}
