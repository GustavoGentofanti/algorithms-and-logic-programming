package matrizes;

import java.util.Scanner;

public class Matrizes_Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int ordemMatriz, soma = 0;

        int matriz[][] = new int[9][9];

        System.out.println("Qual a ordem da matriz?");
        ordemMatriz = entrada.nextInt();

        for (int i = 0; i < ordemMatriz; i++) {
            for (int j = 0; j < ordemMatriz; j++) {
                System.out.println("Elemento [" + i + "," + j + "]:");
                matriz[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < ordemMatriz; i++) {
            for (int j = i + 1; j < ordemMatriz; j++) {
                soma += matriz[i][j];
            }
        }

        System.out.println("Soma dos elementos principais = " + soma);
    }
}
