package estruturas.sequencial;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double precoUnitario, valorCliente, troco;
        int qntUnidades;

        System.out.print("Preço unitário do produto: R$");
        precoUnitario = entrada.nextDouble();
        System.out.print("Quantidade de unidades compradas: ");
        qntUnidades = entrada.nextInt();
        System.out.print("Dinheiro recebido: R$");
        valorCliente = entrada.nextDouble();

        troco = valorCliente - (qntUnidades * precoUnitario);

        System.out.printf("Troco = R$%.2f", troco);
    }
}
