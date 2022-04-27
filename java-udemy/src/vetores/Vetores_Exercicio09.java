package vetores;

import java.util.Scanner;

public class Vetores_Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qntPessoas;

        String nomes[] = new String[9];
        int idades[] = new int[9];

        System.out.println("Quantas pessoas você vai digitar?");
        qntPessoas = entrada.nextInt();

        for (int i = 0; i < qntPessoas; i++) {
            System.out.println("Dados da " + (i + 1) + " pessoa:");
            System.out.println("Nome:");
            entrada.nextLine();
            nomes[i] = entrada.nextLine();
            System.out.println("Idade:");
            idades[i] = entrada.nextInt();
        }

        int maisVelho = idades[0];
        int posMaisVelho = 0;

        for (int i = 0; i < qntPessoas; i++) {
            if (idades[i] > maisVelho) {
                maisVelho = idades[i];
                posMaisVelho = i;
            }
        }

        System.out.println("Pessoa mais velha: " + nomes[posMaisVelho]);
    }
}
