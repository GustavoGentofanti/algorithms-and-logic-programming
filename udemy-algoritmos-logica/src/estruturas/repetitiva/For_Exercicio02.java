package estruturas.repetitiva;

import java.util.Scanner;

public class For_Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int x, y, troca;

        int soma = 0;

        System.out.println("Digite dois números: ");
        x = entrada.nextInt();
        y = entrada.nextInt();

        if (x > y) {
            troca = x;
            x = y;
            y = troca;
        }

        for (int i = x + 1; i < y; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println("Soma dos impares = " + soma);
    }
}
