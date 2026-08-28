#include <iostream>

using namespace std;

unsigned long long fatorial(int numero) {
    unsigned long long resultado = 1;

    for (int i = 2; i <= numero; i++) {
        resultado *= i;
    }

    return resultado;
}

int main() {
    int M, N;

    while (cin >> M >> N) {
        unsigned long long soma = fatorial(M) + fatorial(N);

        cout << soma << endl;
    }

    return 0;
}