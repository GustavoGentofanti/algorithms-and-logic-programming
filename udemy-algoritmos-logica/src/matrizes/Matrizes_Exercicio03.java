package matrizes;

import java.util.Scanner;

public class Matrizes_Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qntLinhas, qntColunas;

        int matriz[][] = new int[9][9];

        System.out.println("Qual a quantidade de linhas da matriz?");
        qntLinhas = entrada.nextInt();
        System.out.println("Qual a quantidade de colunas da matriz?");
        qntColunas = entrada.nextInt();

        for (int i = 0; i < qntLinhas; i++) {
            for (int j = 0; j < qntColunas; j++) {
                System.out.println("Elemento [" + i + "," + j + "]:");
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Valores negativos:");
        for (int i = 0; i < qntLinhas; i++) {
            for (int j = 0; j < qntColunas; j++) {
                if (matriz[i][j] < 0) {
                    System.out.println(matriz[i][j]);
                }
            }
        }
    }
}
