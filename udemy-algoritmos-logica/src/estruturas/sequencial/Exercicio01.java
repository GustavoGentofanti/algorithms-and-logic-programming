package estruturas.sequencial;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double larg, comp, metro, area, preco;

        System.out.println("---- TERRENO ----");
        System.out.println("Digite a largura do terreno: ");
        larg = entrada.nextDouble();
        System.out.println("Digite o comprimento do terreno: ");
        comp = entrada.nextDouble();
        System.out.println("Valor do metro quadrado: R$");
        metro = entrada.nextDouble();

        area = larg * comp;
        preco = metro * area;

        System.out.printf("Area do terreno = %.2f\n", area);
        System.out.printf("Preço do terreno = R$%.2f", preco);
    }
}
