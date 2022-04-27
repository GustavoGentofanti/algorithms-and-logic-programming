package matrizes;

import java.util.Scanner;

public class Matrizes_Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qntLinhas, qntColunas;

        int a[][] = new int[9][9];
        int b[][] = new int[9][9];
        int c[][] = new int[9][9];

        System.out.println("Quantas linhas vai ter a matriz?");
        qntLinhas = entrada.nextInt();
        System.out.println("Quantas colunas vai ter a matriz?");
        qntColunas = entrada.nextInt();

        System.out.println("Digite os valores da matriz A:");
        for (int i = 0; i < qntLinhas; i++) {
            for (int j = 0; j < qntColunas; j++) {
                System.out.println("Elemento [" + i + "," + j + "]:");
                a[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Digite os valores da matriz B:");
        for (int i = 0; i < qntLinhas; i++) {
            for (int j = 0; j < qntColunas; j++) {
                System.out.println("Elemento [" + i + "," + j + "]:");
                b[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Matriz soma:");
        for (int i = 0; i < qntLinhas; i++) {
            for (int j = 0; j < qntColunas; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
