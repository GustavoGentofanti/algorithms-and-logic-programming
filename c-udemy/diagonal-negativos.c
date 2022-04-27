#include <stdio.h>

int main() {

    int ordemMatriz;

    printf("Qual a ordem da matriz? ");
    scanf("%d", &ordemMatriz);

    int matriz[ordemMatriz][ordemMatriz], count = 0;

    for (int i = 0; i < ordemMatriz; i++) {
        for (int j = 0; j < ordemMatriz; j++) {
            printf("Elemento [%d,%d]: ", i, j);
            scanf("%d", &matriz[i][j]);
        }
    }

    printf("Diagonal principal: \n");
    for (int i = 0; i < ordemMatriz; i++) {
        for (int j = 0; j < ordemMatriz; j++) {
            if (i == j) {
                printf("%d ", matriz[i][j]);
            }
        }
    }

    for (int i = 0; i < ordemMatriz; i++) {
        for (int j = 0; j < ordemMatriz; j++) {
            if (matriz[i][j] < 0) {
                count += 1;;
            }
        }
    }

    printf("\nQuantidade de negativos = %d\n", count);

    return 0;
}