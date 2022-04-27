package estruturas.condicional;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota1, nota2, notaFinal;

        System.out.print("Digite a primeira nota: ");
        nota1 = entrada.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = entrada.nextDouble();

        notaFinal = nota1 + nota2;

        System.out.println("Nota final = " + notaFinal);

        if (notaFinal < 60) {
            System.out.println("REPROVADO");
        } else {

        }

    }
}
