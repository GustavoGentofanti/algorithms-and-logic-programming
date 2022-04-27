package vetores;

import java.util.Scanner;

public class Vetores_Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qntPessoas;
        double soma = 0, media, percentualMenores, count = 0;

        String nomes[] = new String[9];
        int idades[] = new int[9];
        double alturas[] = new double[9];

        System.out.println("Quantas pessoas serão digitadas?");
        qntPessoas = entrada.nextInt();

        for (int i = 0; i < qntPessoas; i++) {
            System.out.println("Dados da " + (i + 1) + " pessoa:");
            System.out.println("Nome:");
            entrada.nextLine();
            nomes[i] = entrada.nextLine();
            System.out.println("Idade:");
            idades[i] = entrada.nextInt();
            System.out.println("Altura:");
            alturas[i] = entrada.nextDouble();
        }

        for (int i = 0; i < qntPessoas; i++) {
            soma += alturas[i];
        }

        media = soma / qntPessoas;

        System.out.printf("Altura média: %.2f", media);

        for (int i = 0; i < qntPessoas; i++) {
            if (idades[i] < 16) {
                count += 1;
            }
        }

        percentualMenores = (count * 100) / qntPessoas;

        System.out.println("\nPessoas com menos de 16 anos: " + percentualMenores + "%");

        for (int i = 0; i < qntPessoas; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }
    }
}
