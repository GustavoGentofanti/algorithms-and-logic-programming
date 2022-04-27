package estruturas.repetitiva;

import java.util.Scanner;

public class For_Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int x;

        System.out.println("Digite o valor de X: ");
        x = entrada.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
