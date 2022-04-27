package matrizes;

import java.util.Scanner;

public class Matrizes_Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qntLinhas, qntColunas;

        double matriz[][] = new double[9][9];
        double vetor[] = new double[9];

        System.out.println("Qual a quantidade de linhas da matriz?");
        qntLinhas = entrada.nextInt();
        System.out.println("Qual a quantidade de colunas da matriz?");
        qntColunas = entrada.nextInt();

        for (int i = 0; i < qntLinhas; i++) {
            System.out.println("Digite os elementos da " + (i + 1) + " primeira linha:");
            for (int j = 0; j < qntColunas; j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Vetor gerado:");
        for (int i = 0; i < qntLinhas; i++) {
            vetor[i] = 0;
            for (int j = 0; j < qntColunas; j++) {
                vetor[i] = vetor[i] + matriz[i][j];
            }
            System.out.println(vetor[i]);
        }
    }
}
