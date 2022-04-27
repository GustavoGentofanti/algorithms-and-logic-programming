package matrizes;

import java.util.Scanner;

public class Matrizes_Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int ordemMatriz;

        int matriz[][] = new int[9][9];

        System.out.println("Qual a ordem da matriz?");
        ordemMatriz = entrada.nextInt();

        for (int i = 0; i < ordemMatriz; i++) {
            for (int j = 0; j < ordemMatriz; j++) {
                System.out.println("Elemento [" + i + "," + j + "]:");
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Maior elemento de cada linha:");
        for (int i = 0; i < ordemMatriz; i++) {
            int maiorValor = matriz[i][0];
            for (int j = 0; j < ordemMatriz; j++) {
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                }
            }
            System.out.println(maiorValor);
        }
    }
}
