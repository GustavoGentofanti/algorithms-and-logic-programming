package estruturas.repetitiva;

import java.util.Scanner;

public class For_Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qntNumeros, numeros;

        int count_dentro = 0;
        int count_fora = 0;

        System.out.println("Quantos números você vai digitar? ");
        qntNumeros = entrada.nextInt();

        for (int i = 0; i < qntNumeros; i++) {
            System.out.println("Digite um número: ");
            numeros = entrada.nextInt();

            if (numeros >= 10 && numeros <= 20) {
                count_dentro += 1;
            } else {
                count_fora += 1;
            }
        }

        System.out.println(count_dentro + " DENTRO");
        System.out.println(count_fora + " FORA");
    }
}
