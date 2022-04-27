package estruturas.repetitiva;

import java.util.Scanner;

public class While_Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int codigo;

        int count_alcool = 0;
        int count_gasolina = 0;
        int count_diesel = 0;

        System.out.println("Informe um código (1, 2, 3) ou 4 para parar: ");
        codigo = entrada.nextInt();

        while (codigo != 4) {
            if (codigo == 1) {
                count_alcool += 1;
            } else if (codigo == 2) {
                count_gasolina += 1;
            } else {
                count_diesel += 1;
            }

            System.out.println("Informe um código (1, 2, 3) ou 4 para parar: ");
            codigo = entrada.nextInt();
        }

        System.out.println("MUITO OBRIGADO!");
        System.out.println("Alcool: " + count_alcool);
        System.out.println("Gasolina: " + count_gasolina);
        System.out.println("Diesel: " + count_diesel);
    }
}
