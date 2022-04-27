package matrizes;

import java.util.Scanner;

public class Matrizes_Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int ordemMatriz, soma = 0, linha, coluna;

        double matriz[][] = new double[9][9];

        System.out.println("Qual a ordem da matriz?");
        ordemMatriz = entrada.nextInt();

        for (int i = 0; i < ordemMatriz; i++) {
            for (int j = 0; j < ordemMatriz; j++) {
                System.out.println("Elemento [" + i + "," + j + "]:");
                matriz[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < ordemMatriz; i++) {
            for (int j = 0; j < ordemMatriz; j++) {
                if (matriz[i][j] > 0) {
                    soma += matriz[i][j];
                }
            }
        }

        System.out.println("Soma dos positivos: " + soma);

        System.out.println();

        System.out.println("Escolha uma linha: ");
        linha = entrada.nextInt();
        System.out.print("Linha escolhida: ");
        for (int j = 0; j < ordemMatriz; j++) {
            System.out.print(matriz[linha][j] + " ");
        }


        System.out.println();

        System.out.println("\nEscolha uma coluna: ");
        coluna = entrada.nextInt();
        System.out.print("Coluna escolhida: ");
        for (int i = 0; i < ordemMatriz; i++) {
            System.out.print(matriz[i][coluna] + " ");
        }

        System.out.println();

        System.out.print("\nDiagonal principal:");
        for (int i = 0; i < ordemMatriz; i++) {
            for (int j = 0; j < ordemMatriz; j++) {
                if (i == j) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }

        System.out.println("\nMatriz alterada:");
        for (int i = 0; i < ordemMatriz; i++) {
            for (int j = 0; j < ordemMatriz; j++) {
                if (matriz[i][j] < 0) {
                    matriz[i][j] = Math.pow(matriz[i][j], 2);
                }
            }
            System.out.println();
        }

        System.out.println("\nMatriz alterada:");
        for (int i = 0; i < ordemMatriz; i++) {
            for (int j = 0; j < ordemMatriz; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}