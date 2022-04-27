package estruturas.condicional;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double a, b, c, x1, x2, delta;

        System.out.println("Coeficiente A: ");
        a = entrada.nextDouble();
        System.out.println("Coeficiente B: ");
        b = entrada.nextDouble();
        System.out.println("Coeficiente C: ");
        c = entrada.nextDouble();

        delta = (Math.pow(b, 2)) - (4 * a * c);

        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);

        if (delta == 0 || delta < 0) {
            System.out.println("Esta equação não possui raizes reais.");
        } else {
            System.out.printf("X1 = %.4f\n", x1);
            System.out.printf("X2 =  %.4f", x2);
        }
    }
}
