package estruturas.repetitiva;

import java.util.Scanner;

public class For_Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n;

        System.out.println("Deseja a tabuada para qual valor? ");
        n = entrada.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + (n * i));
        }
    }
}
