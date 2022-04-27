package vetores;

import java.util.Scanner;

public class Vetores_Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qntNumeros;

        int numeros[] = new int[9];

        System.out.println("Quantos números você vai digitar?");
        qntNumeros = entrada.nextInt();

        for (int i = 0; i < qntNumeros; i++) {
            System.out.println("Digite um número:");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("Números negativos: ");
        for (int i = 0; i < qntNumeros; i++) {
            if (numeros[i] < 0) {
                System.out.println(numeros[i]);
            }
        }
    }
}
