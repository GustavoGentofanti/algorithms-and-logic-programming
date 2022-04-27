package estruturas.repetitiva;

import java.util.Scanner;

public class While_Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int x, y;

        System.out.println("Digite dois números: ");
        x = entrada.nextInt();
        y = entrada.nextInt();

        while (x != y) {
            if (x < y) {
                System.out.println("CRESCENTE!");
            } else {
                System.out.println("DECRESCENTE!");
            }

            System.out.println("Digite outros dois números: ");
            x = entrada.nextInt();
            y = entrada.nextInt();
        }
    }
}
