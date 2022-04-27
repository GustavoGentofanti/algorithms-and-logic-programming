#include <stdio.h>

int main() {

    int idades, count = 0, soma = 0;
    double media;

    printf("Digite as idades: \n");
    scanf("%d", &idades);

    while (idades >= 0) {
        count += 1;
        soma += idades;
        scanf("%d", &idades);
    }

    if (count == 0) {
        printf("Impossivel calcular!\n");
    } else {
        media = (double) soma / count;
        printf("Media = %.2lf\n", media);
    }

    return 0;
}