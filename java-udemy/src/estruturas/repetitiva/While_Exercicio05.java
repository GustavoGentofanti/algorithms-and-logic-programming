package estruturas.repetitiva;

import java.util.Scanner;

public class While_Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double n1, n2, media;

        System.out.println("Digite a primeira nota: ");
        n1 = entrada.nextDouble();

        while (n1 < 0 || n1 > 10) {
            System.out.println("Valor inválido! Tente novamente: ");
            n1 = entrada.nextDouble();
        }

        System.out.println("Digite a segunda nota: ");
        n2 = entrada.nextDouble();

        while (n2 < 0 || n2 > 10) {
            System.out.println("Valor inválido! Tente novamente: ");
            n2 = entrada.nextDouble();
        }

        media = (n1 + n2) / 2;

        System.out.println("Média = " + media);
    }
}
