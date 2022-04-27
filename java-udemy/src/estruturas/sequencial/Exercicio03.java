package estruturas.sequencial;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        String nome1, nome2;
        float media, idade1, idade2;

        System.out.println("Dados da primeira pessoa: ");
        System.out.print("Nome: ");
        nome1 = entrada.nextLine();
        System.out.print("Idade: ");
        idade1 = entrada.nextFloat();
        System.out.println();
        System.out.println("------------------------");
        System.out.println();
        System.out.println("Dados da segunda pessoa: ");
        System.out.print("Nome: ");
        entrada.nextLine();
        nome2 = entrada.nextLine();
        System.out.print("Idade: ");
        idade2 = entrada.nextFloat();

        media = (idade1 + idade2) / 2;

        System.out.printf("A média entre as idade de %s e %s é de %.1f anos.", nome1, nome2, media);
    }
}
