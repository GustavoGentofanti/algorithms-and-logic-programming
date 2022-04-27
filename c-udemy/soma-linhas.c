#include <stdio.h>

int main() {

    int qntLinhas, qntColunas;

    printf("Qual a quantidade de linhas da matriz? ");
    scanf("%d", &qntLinhas);
    printf("Qual a quantidade de colunas da matriz? ");
    scanf("%d", &qntColunas);

    double matriz[qntLinhas][qntColunas];
    double vetor[qntLinhas];

    for (int i = 0; i < qntLinhas; i++) {
        printf("Digite os elementos da linha %d: \n", i + 1);
        for (int j = 0; j < qntColunas; j++) {
            scanf("%lf", &matriz[i][j]);
        }
    }

    printf("Vetor gerado: \n");
    for (int i = 0; i < qntLinhas; i++) {
        vetor[i] = 0;
        for (int j = 0; j < qntColunas; j++) {
            vetor[i] = vetor[i] + matriz[i][j];
        }
        printf("%.1lf\n", vetor[i]);
    }

    return 0;
}