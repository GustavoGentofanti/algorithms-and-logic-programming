#include <iostream>

using namespace std;

int main() {

    int x, y, troca;

    cout << "Digite dois numeros:" << endl;
    cin >> x;
    cin >> y;

    while (x != y) {
        if (x > y) {
            cout << "Decrescente" << endl;
        } else {
            cout << "Crescente" << endl;
        }

        cout << "Digite outros dois numeros:" << endl;
        cin >> x;
        cin >> y;
    }

    return 0;
}