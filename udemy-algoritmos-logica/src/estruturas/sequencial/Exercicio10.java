package estruturas.sequencial;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int duracaoTempo, horas, minutos, segundos, resto;

        System.out.println("Digite a duração em segundos: ");
        duracaoTempo = entrada.nextInt();

        horas = duracaoTempo / 3600;
        resto = duracaoTempo % 3600;
        minutos = resto / 60;
        segundos = resto % 60;

        System.out.printf("%d:%d:%d", horas, minutos, segundos);

    }
}
