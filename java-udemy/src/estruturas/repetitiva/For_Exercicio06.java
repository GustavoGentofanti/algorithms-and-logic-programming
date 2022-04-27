package estruturas.repetitiva;

import java.util.Scanner;

public class For_Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double qntCasos, n1, n2, n3, media;

        System.out.println("Quantos casos você vai digitar? ");
        qntCasos = entrada.nextInt();

        for (int i = 0; i < qntCasos; i++) {
            System.out.println("Digite três notas: ");
            n1 = entrada.nextDouble();
            n2 = entrada.nextDouble();
            n3 = entrada.nextDouble();

            media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;

            System.out.println("Média = " + media);
        }
    }
}
