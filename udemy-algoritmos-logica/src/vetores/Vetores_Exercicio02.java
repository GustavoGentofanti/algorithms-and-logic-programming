package vetores;

import java.util.Scanner;

public class Vetores_Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qntNumeros;
        double soma = 0, media;

        double numeros[] = new double[9];

        System.out.println("Quantos números você vai digitar?");
        qntNumeros = entrada.nextInt();

        for (int i = 0; i < qntNumeros; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = entrada.nextDouble();
        }

        System.out.print("Valores: ");
        for (int i = 0; i < qntNumeros; i++) {
            System.out.print(numeros[i] + " ");
        }

        for (int i = 0; i < qntNumeros; i++) {
            soma += numeros[i];
        }

        media = soma / qntNumeros;

        System.out.println("\nSoma = " + soma);
        System.out.println("Média = " + media);
    }
}
