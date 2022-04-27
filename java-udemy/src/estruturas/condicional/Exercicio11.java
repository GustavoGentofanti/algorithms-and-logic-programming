package estruturas.condicional;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salarioFunc, salarioFinal, aumento;
        int porcentagem;

        System.out.print("Digite o salário da pessoa: R$");
        salarioFunc = entrada.nextDouble();

        if (salarioFunc <= 1000) {
            aumento = salarioFunc * 0.20;
            salarioFinal = salarioFunc + aumento;
            porcentagem = 20;
        } else if (salarioFunc <= 3000) {
            aumento = salarioFunc * 0.15;
            salarioFinal = salarioFunc + aumento;
            porcentagem = 15;
        } else if (salarioFunc <= 8000) {
            aumento = salarioFunc * 0.10;
            salarioFinal = salarioFunc + aumento;
            porcentagem = 10;
        } else {
            aumento = salarioFunc * 0.05;
            salarioFinal = salarioFunc + aumento;
            porcentagem = 5;
        }

        System.out.printf("Novo salário = R$%.2f\n", salarioFinal);
        System.out.printf("Aumento = R$%.2f\n", aumento);
        System.out.println("Porcentagem = " + porcentagem + "%");
    }
}
