#include <iostream>
#include <string>
#include <iomanip>
#include <climits>

using namespace std;

int main() {

    int qntPessoas, count = 0;
    double soma = 0.0, media, porcentagem;

    cout << "Quantas pessoas serao digitadas? ";
    cin >> qntPessoas;

    string nome[qntPessoas];
    int idade[qntPessoas];
    double altura[qntPessoas];

    for (int i = 0; i < qntPessoas; i++) {
        cout << "Dados da " << i + 1 << " pessoa:" << endl;
        cout << "Nome: ";
        cin.ignore(INT64_MAX, '\n');
        getline(cin, nome[i]);
        cout << "Idade: ";
        cin >> idade[i];
        cout << "Altura: ";
        cin >> altura[i];
    }

    for (int i = 0; i < qntPessoas; i++) {
        soma += altura[i];
    }

    media = soma / qntPessoas;

    cout << fixed << setprecision(2);
    cout << "Altura media = " << media << endl;

    for (int i = 0; i < qntPessoas; i++) {
        if (idade[i] < 16) {
            count += 1;
        }
    }

    porcentagem = (double) (count * 100) / qntPessoas;

    cout << fixed << setprecision(1);
    cout << "Porcentagem de pessoas com menos de 16 anos: " << porcentagem << "%" << endl;
    for (int i = 0; i < qntPessoas; i++) {
        if (idade[i] < 16) {
            cout << nome[i] << endl;
        }
    }

    return 0;
}