package estruturas.repetitiva;

import java.util.Scanner;

public class For_Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double qntCasos, numerador, denominador, divisao;

        System.out.println("Quantos casos você vai digitar? ");
        qntCasos = entrada.nextInt();

        for (int i = 0; i < qntCasos; i++) {
            System.out.println("Entre com numerador: ");
            numerador = entrada.nextDouble();
            System.out.println("Entre com denominador: ");
            denominador = entrada.nextDouble();

            if (denominador != 0) {
                divisao = numerador / denominador;
                System.out.println("Divisão = " + divisao);
            } else {
                System.out.println("Divisão impossivel");
            }
        }
    }
}
