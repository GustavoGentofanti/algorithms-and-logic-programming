package estruturas.repetitiva;

import java.util.Scanner;

public class While_Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idades;
        double media;

        int soma = 0;
        int count = 0;

        System.out.println("Digite as idades: ");
        idades = entrada.nextInt();

        while (idades > 0) {
            soma += idades;
            count += 1;

            idades = entrada.nextInt();
        }

        if (count > 0) {
            media = soma / count;
            System.out.println("Média = " + media);
        } else {
            System.out.println("Impossivel calcular");
        }
    }
}
