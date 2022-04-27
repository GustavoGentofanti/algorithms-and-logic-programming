package vetores;

import java.util.Scanner;

public class Vetores_Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qntElementos;
        double soma = 0, count = 0, media;

        int numeros[] = new int[9];

        System.out.println("Quantos elementos vai ter o vetor?");
        qntElementos = entrada.nextInt();

        for (int i = 0; i < qntElementos; i++) {
            System.out.println("Digite um número:");
            numeros[i] = entrada.nextInt();
        }

        for (int i = 0; i < qntElementos; i++) {
            if (numeros[i] % 2 == 0) {
                soma += numeros[i];
                count += 1;
            }
        }

        if (count == 0) {
            System.out.println("Nenhuma número par foi digitado");
        } else {
            media = soma / count;
            System.out.println("Média dos pares = " + media);
        }
    }
}
