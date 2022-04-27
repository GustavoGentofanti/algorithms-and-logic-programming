package estruturas.repetitiva;

import java.util.Scanner;

public class While_Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int x;

        int soma = 0;

        System.out.println("Digite um número inteiro: ");
        x = entrada.nextInt();

        while (x != 0) {
            if (x % 2 == 0) {
                soma += x * 5 + 20;
                System.out.println("Soma = " + soma);
            } else {
                soma += x * 5 + 25;
                System.out.println("Soma = " + soma);
            }

            System.out.println("Digite um número inteiro: ");
            x = entrada.nextInt();
        }
    }
}
