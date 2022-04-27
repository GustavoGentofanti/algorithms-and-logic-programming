package matrizes;

import java.util.Scanner;

public class Matrizes_Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int ordemMatriz, count = 0;

        int matriz[][] = new int[9][9];

        System.out.println("Qual a ordem da matriz?");
        ordemMatriz = entrada.nextInt();

        for (int i = 0; i < ordemMatriz; i++) {
            for (int j = 0; j < ordemMatriz; j++) {
                System.out.println("Elemento [" + i + "," + j + "]:");
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Diagonal principal:");

        for (int i = 0; i < ordemMatriz; i++) {
            for (int j = 0; j < ordemMatriz; j++) {
                if (i == j) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }

        for (int i = 0; i < ordemMatriz; i++) {
            for (int j = 0; j < ordemMatriz; j++) {
                if (matriz[i][j] < 0) {
                    count += 1;
                }
            }
        }

        System.out.println("\nQuantidade de negativos = " + count);
    }
}
