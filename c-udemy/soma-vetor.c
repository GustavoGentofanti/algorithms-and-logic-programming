#include <stdio.h>

int main() {

    int qntNumeros;
    double soma = 0.0, media;

    printf("Quantos números você vai digitar? ");
    scanf("%d", &qntNumeros);

    double vetor[qntNumeros];

    for (int i = 0; i < qntNumeros; i++) {
        printf("Digite um número: ");
        scanf("%lf", &vetor[i]);
    }

    printf("Valores = ");
    for (int i = 0; i < qntNumeros; i++) {
        printf("%.2lf ", vetor[i]);
    }

    for (int i = 0; i < qntNumeros; i++) {
        soma += vetor[i];
    }

    media = soma / qntNumeros;

    printf("\nSoma = %.2lf", soma);
    printf("\nMédia = %.2lf\n", media);

    return 0;
}