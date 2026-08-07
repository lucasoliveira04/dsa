#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;

    int nums[n];
    for (int i = 0; i < n; i++) {
        cin >> nums[i];
    }

    int menorNumero = nums[0];
    int indexDoMenorNumero = 0;

    for (int i = 1; i < n; i++) {
        if (nums[i] < menorNumero) {
            menorNumero = nums[i];
            indexDoMenorNumero = i;
        }
    }

    cout << "Menor valor: " << menorNumero << endl;
    cout << "Posicao: " << indexDoMenorNumero << endl;

    return 0;
}
