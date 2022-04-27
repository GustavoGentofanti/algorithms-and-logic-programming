#include <stdio.h>
#include <string.h>

void limpar_entrada() {
    char c;
    while ((c = getchar()) != '\n' && c != EOF) {}
}

void ler_texto(char *buffer, int length) {
    fgets(buffer, length, stdin);
    strtok(buffer, "\n");
}

int main() {

    int qntPessoas;
    double media, soma = 0, count = 0, porcentagem;

    printf("Quantas pessoas serão digitadas? ");
    scanf("%d", &qntPessoas);

    char nomes[qntPessoas][50];
    int idades[qntPessoas];
    double alturas[qntPessoas];

    for (int i = 0; i < qntPessoas; i++) {
        printf("Dados da %d pessoa: \n", i+1);
        printf("Nome: ");
        limpar_entrada();
        ler_texto(nomes[i], 50);
        printf("Idade: ");
        scanf("%d", &idades[i]);
        printf("Altura: ");
        scanf("%lf", &alturas[i]);
    }


    for (int i = 0; i < qntPessoas; i++) {
        soma += alturas[i];
    }

    media = soma / qntPessoas;

    printf("Altura média: %.2lf\n", media);

    for (int i = 0; i < qntPessoas; i++) {
        if (idades[i] < 16) {
            count += 1;
            porcentagem = (100 * count) / qntPessoas;
        }
    }

    printf("Porcentagem de pessoas com menos de 16 anos: %.2lf\n", porcentagem);
    for (int i = 0; i < qntPessoas; i++) {
        if (idades[i] < 16) {
            printf("%s\n", nomes[i]);
        }
    }

    return 0;
}