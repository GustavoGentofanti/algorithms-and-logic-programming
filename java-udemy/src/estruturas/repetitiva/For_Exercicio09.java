package estruturas.repetitiva;

import java.util.Scanner;

public class For_Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qntCasos, qntCobaias, totalCobaias;
        double percentual_sapo, percentual_rato, percentual_coelho;
        String tipoCobaias;

        int count_sapo = 0;
        int count_rato = 0;
        int count_coelho = 0;

        System.out.println("Quantos casos serão digitados? ");
        qntCasos = entrada.nextInt();

        for (int i = 0; i < qntCasos; i++) {
            System.out.println("Quantidade de cobaias: ");
            qntCobaias = entrada.nextInt();
            System.out.println("Tipo de cobaia: ");
            entrada.nextLine();
            tipoCobaias = entrada.nextLine();

            if (tipoCobaias.equalsIgnoreCase("s")) {
                count_sapo += qntCobaias;
            } else if (tipoCobaias.equalsIgnoreCase("r")) {
                count_rato += qntCobaias;
            } else {
                count_coelho += qntCobaias;
            }
        }

        totalCobaias = count_sapo + count_rato + count_coelho;

        percentual_rato = (count_rato * 100) / totalCobaias;
        percentual_sapo = (count_sapo * 100) / totalCobaias;
        percentual_coelho = (count_coelho * 100) / totalCobaias;

        System.out.println("-------- RELATÓRIO FINAL --------");
        System.out.println("Total: " + totalCobaias + " cobaias");
        System.out.println("Total de Coelhos: " + count_coelho);
        System.out.println("Total de Ratos: " + count_rato);
        System.out.println("Total de Sapos: " + count_sapo);
        System.out.printf("Percentual de Coelhos: %.2f\n", percentual_coelho);
        System.out.printf("Percentual de Ratos: %.2f\n", percentual_rato);
        System.out.printf("Percentual de Sapos: %.2f", percentual_sapo);
    }
}
