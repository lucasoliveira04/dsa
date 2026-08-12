#include <iostream>
#include <numeric>

using namespace std;

int main() {
    int N;
    cin >> N;

    while (N--) {
        int N1, D1, N2, D2;
        char b1, b2, op;

        cin >> N1 >> b1 >> D1 >> op >> N2 >> b2 >> D2;

        int numerador;
        int denominador;

        if (op == '+') {
            numerador = N1 * D2 + N2 * D1;
            denominador = D1 * D2;
        }
        else if (op == '-') {
            numerador = N1 * D2 - N2 * D1;
            denominador = D1 * D2;
        }
        else if (op == '*') {
            numerador = N1 * N2;
            denominador = D1 * D2;
        }
        else if (op == '/') {
            numerador = N1 * D2;
            denominador = N2 * D1;
        }

        int divisor = gcd(numerador, denominador);

        int numeradorSimplificado = numerador / divisor;
        int denominadorSimplificado = denominador / divisor;

        cout << numerador << "/" << denominador
             << " = "
             << numeradorSimplificado << "/" << denominadorSimplificado
             << endl;
    }

    return 0;
}