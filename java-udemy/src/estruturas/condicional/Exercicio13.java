package estruturas.condicional;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double x, y;

        System.out.println("Valor de X: ");
        x = entrada.nextDouble();
        System.out.println("Valor de Y: ");
        y = entrada.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0  && y > 0) {
            System.out.println("Q2");
        } else if (x < 0  && y < 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0){
            System.out.println("Q4");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else {
            System.out.println("Origem");
        }
    }
}
