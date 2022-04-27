#include <stdio.h>

int main() {

    int qntNumeros;

    printf("Quantos números você vai digitar? ");
    scanf("%d", &qntNumeros);

    int vetor[qntNumeros];

    for (int i = 0; i < qntNumeros; i++) {
        printf("Digite um número: ");
        scanf("%d", &vetor[i]);
    }

    printf("\nNúmeros negativos: \n");
    for (int i = 0; i < qntNumeros; i++) {
        if (vetor[i] < 0) {
            printf("%d\n", vetor[i]);
        }
    }

    return 0;
}