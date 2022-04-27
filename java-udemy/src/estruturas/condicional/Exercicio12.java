package estruturas.condicional;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int horaInicial, horaFinal, duracao;

        System.out.println("Hora inicial: ");
        horaInicial = entrada.nextInt();
        System.out.println("Hora final: ");
        horaFinal = entrada.nextInt();

        if (horaInicial > horaFinal) {
            duracao = 24 - (horaInicial + horaFinal);
        } else if (horaInicial == horaFinal){
            duracao = 24;
        } else {
            duracao = (horaFinal - horaInicial);
        }

        System.out.println("O jogo durou " + duracao + " horas");
    }
}
