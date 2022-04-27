package estruturas.condicional;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double qntGlicose;

        System.out.println("Digite a medida da glicose: ");
        qntGlicose = entrada.nextDouble();

        if (qntGlicose <= 100) {
            System.out.println("Classificação: Normal");
        } else if (qntGlicose <= 140) {
            System.out.println("Classificação: Elevado");
        } else {
            System.out.println("Classificação: Diabetes");
        }
    }
}
