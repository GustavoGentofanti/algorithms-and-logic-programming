package estruturas.condicional;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double c, f, temperatura;
        String resposta;

        System.out.println("Você vai digitar a temperatura em qual escala (C/F)?");
        resposta = entrada.nextLine();

        if (resposta.equalsIgnoreCase("c")) {
            System.out.println("Digite a temperatura em Celsius: ");
            c = entrada.nextDouble();

            temperatura = (c * 1.8) + 32;

            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f", temperatura);
        } else {
            System.out.println("Digite a temperatura em Fahrenheit: ");
            f = entrada.nextDouble();

            temperatura = (f - 32) / 1.8;

            System.out.printf("Temperatura equivalente em Celsius: %.2f", temperatura);
        }
    }
}
