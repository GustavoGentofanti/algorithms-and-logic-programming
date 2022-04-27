package estruturas.repetitiva;

import java.util.Scanner;

public class While_Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int senhas;

        System.out.println("Digite a senha: ");
        senhas = entrada.nextInt();

        while (senhas != 2002) {
            System.out.println("Senha inválida! Tente novamente: ");
            senhas = entrada.nextInt();
        }

        System.out.println("Acesso permitido!");
    }
}
