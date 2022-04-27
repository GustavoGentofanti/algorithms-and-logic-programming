package vetores;

import java.util.Scanner;

public class Vetores_Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qntAlunos;
        double media;

        String alunos[] = new String[9];
        double nota1[] = new double[9];
        double nota2[] = new double[9];

        System.out.println("Quantos alunos serão digitados?");
        qntAlunos = entrada.nextInt();

        for (int i = 0; i < qntAlunos; i++) {
            System.out.println("Digite o nome, a primeira e a segunda nota do " + (i + 1) + " aluno:");
            entrada.nextLine();
            alunos[i] = entrada.nextLine();
            nota1[i] = entrada.nextDouble();
            nota2[i] = entrada.nextDouble();
        }

        System.out.println("Alunos aprovados:");
        for (int i = 0; i < qntAlunos; i++) {
            media = (nota1[i] + nota2[i]) / 2;

            if (media >= 6) {
                System.out.println(alunos[i]);
            }
        }
    }
}
