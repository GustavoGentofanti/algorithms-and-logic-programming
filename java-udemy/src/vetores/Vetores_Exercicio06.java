package vetores;

import java.util.Scanner;

public class Vetores_Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qntValores;

        int a[] = new int[9];
        int b[] = new int[9];
        int c[] = new int[9];

        System.out.println("Quantos valores vai ter em cada vetor?");
        qntValores = entrada.nextInt();

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < qntValores; i++) {
            a[i] = entrada.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < qntValores; i++) {
            b[i] = entrada.nextInt();
        }

        System.out.println("Vetor resultante:");
        for (int i = 0; i < qntValores; i++) {
            c[i] = a[i] + b[i];
            System.out.println(c[i]);
        }
    }
}
