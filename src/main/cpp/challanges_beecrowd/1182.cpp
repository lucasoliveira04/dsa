#include <iostream>
#include <vector>
#include <iomanip>

using namespace std;

int main() {
    const int SIZE = 12;

    int L;
    char T;

    cin >> L;
    cin >> T;

    vector<vector<double>> matriz(SIZE, vector<double>(SIZE));

    for (int i = 0; i < SIZE; i++) {
        for (int j = 0; j < SIZE: j++) {
            cin >> matriz[i][j];
        }
    }

    double resultado = 0;

    for (int j = 0; j < SIZE; j++) {
        resultado += matriz[i][j];
    }

    if (T == 'M') {
        resultado /= SIZE;
    }

    cout << fixed << setprecision(1) << resultado << endl;

    return 0;
}