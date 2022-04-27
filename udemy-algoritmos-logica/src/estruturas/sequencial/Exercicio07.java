package estruturas.sequencial;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome;
        double valorHora, qntHoras, valorPagamento;

        System.out.print("Nome: ");
        nome = entrada.nextLine();
        System.out.print("Valor por hora: R$");
        valorHora = entrada.nextDouble();
        System.out.print("Horas trabalhadas: ");
        qntHoras = entrada.nextDouble();

        valorPagamento = valorHora * qntHoras;

        System.out.printf("O pagamento de %s deve ser de R$%.2f", nome, valorPagamento);
    }
}
