package vetores;

import java.util.Scanner;

public class Vetores_Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qntNumeros, count = 0;

        int numeros[] = new int[9];

        System.out.println("Quantos números você vai digitar?");
        qntNumeros = entrada.nextInt();

        for (int i = 0; i < qntNumeros; i++) {
            System.out.println("Digite um número:");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("Números pares:");
        for (int i = 0; i < qntNumeros; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
                count += 1;
            }
        }

        System.out.println("\nQuantidade de pares = " + count);
    }
}
