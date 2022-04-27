package estruturas.condicional;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double t1, t2, t3, maior;

        System.out.println("Digite as três distâncias: ");
        t1 = entrada.nextDouble();
        t2 = entrada.nextDouble();
        t3 = entrada.nextDouble();

        if (t1 > t2 && t1 > t3) {
            maior = t1;
        } else if (t2 > t1 && t2 > t3) {
            maior = t2;
        } else {
            maior = t3;
        }

        System.out.printf("Maior distância: %.2f", maior);
    }
}
