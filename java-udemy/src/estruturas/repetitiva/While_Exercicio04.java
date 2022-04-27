package estruturas.repetitiva;

import java.util.Scanner;

public class While_Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int x, y;

        System.out.println("Digite os valores das coordenadas X e Y: ");
        x = entrada.nextInt();
        y = entrada.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Q1");
            } else if (x < 0 && y > 0) {
                System.out.println("Q2");
            } else if (x < 0 && y < 0) {
                System.out.println("Q3");
            } else {
                System.out.println("Q4");
            }

            System.out.println("Digite os valores das coordenadas X e Y: ");
            x = entrada.nextInt();
            y = entrada.nextInt();
        }
    }
}
