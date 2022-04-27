package estruturas.condicional;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n1, n2, n3, menor;

        System.out.println("Primeiro valor: ");
        n1 = entrada.nextInt();
        System.out.println("Segundo valor: ");
        n2 = entrada.nextInt();
        System.out.println("Terceiro valor: ");
        n3 = entrada.nextInt();

        if (n1 < n2 && n1 < n3) {
            menor = n1;
        } else if (n2 < n1 && n2 < n3){
            menor = n2;
        } else {
            menor = n3;
        }

        System.out.println("Menor = " + menor);
    }
}
