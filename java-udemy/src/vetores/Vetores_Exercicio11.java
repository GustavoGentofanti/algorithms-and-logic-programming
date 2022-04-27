package vetores;

import java.util.Scanner;

public class Vetores_Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qntPessoas, countHomens = 0;
        double somaAlturaMulheres = 0, countMulheres = 0, media;

        double alturas[] = new double[9];
        String generos[] = new String[9];

        System.out.println("Quantas pessoas serão digitadas?");
        qntPessoas = entrada.nextInt();

        for (int i = 0; i < qntPessoas; i++) {
            System.out.println("Altura da " + (i + 1) + " pessoa:");
            alturas[i] = entrada.nextDouble();
            System.out.println("Gênero da " + (i + 1) + " pessoa:");
            entrada.nextLine();
            generos[i] = entrada.nextLine();
        }

        double menorAltura = alturas[0];
        double maiorAltura = alturas[0];

        for (int i = 0; i < qntPessoas; i++) {
            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            } else if (alturas[i] < menorAltura){
                menorAltura = alturas[i];
            }
        }

        System.out.println("Menor altura = " + menorAltura);
        System.out.println("Maior altura = " + maiorAltura);

        for (int i = 0; i < qntPessoas; i++) {
            if (generos[i].equalsIgnoreCase("f")) {
                somaAlturaMulheres += alturas[i];
                countMulheres += 1;
            } else {
                countHomens += 1;
            }
        }

        media = somaAlturaMulheres / countMulheres;

        System.out.printf("Média das mulheres = %.2f", media);
        System.out.println("\nNúmero de homens = " + countHomens);
    }
}
