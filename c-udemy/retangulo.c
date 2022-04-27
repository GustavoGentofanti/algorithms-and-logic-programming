#include <stdio.h>
#include <math.h>

int main() {

    double base, altura, area, perimetro, diagonal;

    printf("Base do retângulo: ");
    scanf("%lf", &base);
    printf("Altura do retângulo: ");
    scanf("%lf", &altura);

    area = base * altura;
    perimetro = (base * 2) + (altura * 2);
    diagonal = sqrt(pow(base, 2.0) + pow(altura, 2.0));

    printf("Área = %.4lf", area);
    printf("Perimetro = %.4lf", perimetro);
    printf("Diagonal = %.4lf", diagonal);

    return 0;
}