package vetores;

import java.util.Scanner;

public class Vetores_Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qntNumeros;

        double numeros[] = new double[9];

        System.out.println("Quantos números você vai digitar?");
        qntNumeros = entrada.nextInt();

        for (int i = 0; i < qntNumeros; i++) {
            System.out.println("Digite um número:");
            numeros[i] = entrada.nextDouble();
        }

        double maiorValor = numeros[0];
        int posMaior = 0;

        for (int i = 0; i < qntNumeros; i++) {
            if (numeros[i] > maiorValor) {
                maiorValor = numeros[i];
                posMaior = i;
            }
        }

        System.out.println("Maior valor = " + maiorValor);
        System.out.println("Posição do maior valor = " + posMaior);
    }
}
