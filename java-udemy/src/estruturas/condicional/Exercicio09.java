package estruturas.condicional;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int codigo, qntComprada;
        double valorPago;

        System.out.println("Código do produto comprado: ");
        codigo = entrada.nextInt();
        System.out.println("Quantidade comprada: ");
        qntComprada = entrada.nextInt();

        if (codigo == 1) {
            valorPago = qntComprada * 5;
        } else if (codigo == 2) {
            valorPago = qntComprada * 3.50;
        } else if (codigo == 3) {
            valorPago = qntComprada * 4.80;
        } else if (codigo == 4) {
            valorPago = qntComprada * 8.90;
        } else {
            valorPago = qntComprada * 7.32;
        }

        System.out.printf("Valor a pagar: R$%.2f", valorPago);
    }
}
