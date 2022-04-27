package estruturas.sequencial;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int x, y, soma;

        System.out.print("Digite o valor de X: ");
        x = entrada.nextInt();
        System.out.print("Digite o valor de Y: ");
        y = entrada.nextInt();

        soma = x + y;

        System.out.println("Soma = " + soma);

    }
}
