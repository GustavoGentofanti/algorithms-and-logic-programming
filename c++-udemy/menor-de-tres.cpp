#include <iostream>

using namespace std;

int main() {

    int a, b, c;

    cout << "Primeiro valor: ";
    cin >> a;
    cout << "Segundo valor: ";
    cin >> b;
    cout << "Terceiro valor: ";
    cin >> c;

    int menor = 0;

    if (a < b && a < c) {
        menor = a;
    } else if (b < a && b < c) {
        menor = b;
    } else {
        menor = c;
    }

    cout << "Menor = " << menor << endl;

    return 0;
}