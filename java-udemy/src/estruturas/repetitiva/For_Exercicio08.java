package estruturas.repetitiva;

import java.util.Scanner;

public class For_Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

         int n;

         int fat = 1;

        System.out.println("Digite o valor de N: ");
        n = entrada.nextInt();

        for (int i = 1; i <= n; i++) {
            fat = fat * i;
        }

        System.out.println(fat);
    }
}
