#include <iostream>

using namespace std;

int main() {

    int x, y, troca, soma = 0;

    cout << "Digite dois numeros:" << endl;
    cin >> x;
    cin >> y;

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

    cout << "Soma dos impares = " << soma << endl;

    return 0;
}