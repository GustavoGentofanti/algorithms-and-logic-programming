package estruturas.sequencial;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double a, b, c, areaQuadrado, areaTriangulo, areaTrapezio;

        System.out.println("Digite a medida A: ");
        a = entrada.nextDouble();
        System.out.println("Digite a medida B: ");
        b = entrada.nextDouble();
        System.out.println("Digite a medida C: ");
        c = entrada.nextDouble();

        areaQuadrado = a * a;
        areaTriangulo = (a * b) / 2;
        areaTrapezio = ((a + b) / 2) * c;

        System.out.printf("Área do quadrado que tem lado A: %.4f\n", areaQuadrado);
        System.out.printf("Área do triângulo que tem base A e altura B: %.4f\n", areaTriangulo);
        System.out.printf("Área do trapézio que tem bases A e B, e altura C: %.4f", areaTrapezio);
    }
}
