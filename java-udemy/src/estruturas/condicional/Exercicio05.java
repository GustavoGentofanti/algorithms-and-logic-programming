package estruturas.condicional;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double precoUnitario, qntUnidades, valorCliente, troco, dinheiroFalta;

        System.out.print("Preço unitário do produto: R$");
        precoUnitario = entrada.nextDouble();
        System.out.print("Quantidade comprada: ");
        qntUnidades = entrada.nextDouble();
        System.out.print("Dinheiro recebido: R$");
        valorCliente = entrada.nextDouble();

        if (valorCliente < (precoUnitario * qntUnidades)) {
            dinheiroFalta = (precoUnitario * qntUnidades) - valorCliente;
            System.out.printf("Dinheiro insuficiente. Faltam R$%.2f", dinheiroFalta);
        } else {
            troco = valorCliente - (precoUnitario * qntUnidades);
            System.out.printf("Troco = R$%.2f", troco);
        }
    }
}
