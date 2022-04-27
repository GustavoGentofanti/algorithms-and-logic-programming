package estruturas.sequencial;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double raio, area;
        final double PI = 3.14159;

        System.out.println("Digite o valor do raio do circulo: ");
        raio = entrada.nextDouble();

        area = PI * Math.pow(raio, 2);

        System.out.printf("Área do circulo = %.3f", area);
    }
}
