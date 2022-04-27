package estruturas.repetitiva;

import java.util.Scanner;

public class For_Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qntNumeros, numeros;

        System.out.println("Quantos números você vai digitar? ");
        qntNumeros = entrada.nextInt();

        for (int i = 0; i < qntNumeros; i++) {
            System.out.println("Digite um número: ");
            numeros = entrada.nextInt();

            if (numeros == 0) {
                System.out.println("NULO");
            } else if (numeros % 2 == 0) {
                if (numeros > 0) {
                    System.out.println("PAR POSITIVO");
                } else {
                    System.out.println("PAR NEGATIVO");
                }
            } else {
                if (numeros > 0) {
                    System.out.println("IMPAR POSITIVO");
                } else {
                    System.out.println("IMPAR NEGATIVO");
                }
            }
        }
    }
}
