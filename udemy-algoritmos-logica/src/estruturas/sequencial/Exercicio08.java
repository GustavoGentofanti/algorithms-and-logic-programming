package estruturas.sequencial;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double distancia, combustivelGasto, consumoMedio;

        System.out.print("Distância percorrida (KM): ");
        distancia = entrada.nextDouble();
        System.out.print("Combustível gasto: ");
        combustivelGasto = entrada.nextDouble();

        consumoMedio = distancia / combustivelGasto;

        System.out.printf("Consumo médio: %.3f", consumoMedio);
    }
}
