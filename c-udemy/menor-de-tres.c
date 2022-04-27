#include <stdio.h>

int main() {

    int n1, n2, n3, menorValor = 0;

    printf("Primeiro valor: ");
    scanf("%d", &n1);
    printf("Segundo valor: ");
    scanf("%d", &n2);
    printf("Terceiro valor: ");
    scanf("%d", &n3);

    if (n1 < n2 && n1 < n3) {
        menorValor = n1;
    } else if (n2 < n1 && n2 < n3) {
        menorValor = n2;
    } else {
        menorValor = n3;
    }

    printf("Menor valor = %d\n", menorValor);

    return 0;
}