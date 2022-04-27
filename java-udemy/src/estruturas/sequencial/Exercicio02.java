package estruturas.sequencial;

import java.lang.Math;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double base, altura, area, perimetro, diagonal;

        System.out.println("Base do retângulo: ");
        base = entrada. nextDouble();
        System.out.println("Altura do retângulo: ");
        altura = entrada. nextDouble();

        area = base * altura;
        perimetro = (base * 2) + (altura * 2);
        diagonal = Math.sqrt((Math.pow(base, 2)) + (Math.pow(altura, 2)));

        System.out.println("-----------------------------");
        System.out.printf("Área = %.4f\n", area);
        System.out.printf("Perímetro = %.4f\n", perimetro);
        System.out.printf("Diagonal = %.4f", diagonal);
    }
}
