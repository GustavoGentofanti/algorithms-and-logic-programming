#include <stdio.h>

int main() {

    double largura, comprimento, metroQuadrado, area, preco;

    printf("Digite a largura do terreno: ");
    scanf("%lf", &largura);
    printf("Digite o comprimento do terreno: ");
    scanf("%lf", &comprimento);
    printf("Digite o valor do metro quadrado: ");
    scanf("%lf", &metroQuadrado);

    area = largura * comprimento;
    preco = metroQuadrado * area;

    printf("Area do terreno = %.2lf\n", area);
    printf("Preço do terreno = R$%.2lf\n", preco);

    return 0;
}