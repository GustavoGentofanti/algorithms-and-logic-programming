#include <iostream>

using namespace std;

int main() {

    int ordemMatriz, count = 0;

    cout << "Qual a ordem da matriz? ";
    cin >> ordemMatriz;

    int matriz[ordemMatriz][ordemMatriz];

    for (int i = 0; i < ordemMatriz; i++) {
        for (int j = 0; j < ordemMatriz; j++) {
            cout << "Elemento [" << i << "," << j << "]: ";
            cin >> matriz[i][j];
        }
    }

    cout << "Diagonal principal:" << endl;
    for (int i = 0; i < ordemMatriz; i++) {
        for (int j = 0; j < ordemMatriz; j++) {
            if (i == j) {
                cout << matriz[i][j] << " ";
            }
        }
    }

    for (int i = 0; i < ordemMatriz; i++) {
        for (int j = 0; j < ordemMatriz; j++) {
            if (matriz[i][j] < 0) {
                count += 1;
            }
        }
    }

    cout << endl << "Quantidade de negativos = " << count << endl;

    return 0;
}