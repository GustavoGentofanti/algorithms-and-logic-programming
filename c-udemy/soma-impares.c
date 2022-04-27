#include <stdio.h>

int main() {

    int x, y, soma = 0, troca;

    printf("Digite dois números: \n");
    scanf("%d", &x);
    scanf("%d", &y);

    if (x > y) {
        troca = x;
        x = y;
        y = troca;
    }

    for (int i = x + 1; i < y; i++) {
        if (i % 2 != 0) {
            soma += i;
        }
    }

    printf("Soma dos impares = %d\n", soma);

    return 0;
}