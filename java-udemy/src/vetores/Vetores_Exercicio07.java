package vetores;

import java.util.Scanner;

public class Vetores_Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qntElementos;
        double soma = 0, media;

        double numeros[] = new double[9];

        System.out.println("Quantos elementos você vai digitar?");
        qntElementos = entrada.nextInt();

        for (int i = 0; i < qntElementos; i++) {
            System.out.println("Digite um número:");
            numeros[i] = entrada.nextDouble();

            soma += numeros[i];
        }

        media = soma / qntElementos;

        System.out.println("Média do vetor = " + media);

        System.out.println("Elementos abaixo da média:");
        for (int i = 0; i < qntElementos; i++) {
            if (numeros[i] < media) {
                System.out.println(numeros[i]);
            }
        }
    }
}
