package estruturas.condicional;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qntMinutos;
        double valorPago;

        System.out.println("Digite a quantidade de minutos: ");
        qntMinutos = entrada.nextInt();

        if (qntMinutos < 100) {
            valorPago = 50;
        } else {
            valorPago = 50 + (qntMinutos - 100) * 2;
        }

        System.out.printf("Valor a pagar: R$%.2f", valorPago);
    }
}
