#include <iostream>
#include <vector>
#include <iomanip>

using namespace std;

int main() {
    const int SIZE = 12;

    vector<vector<double>> matriz(SIZE, vector<double>(SIZE));

    int L;
    char T;

    cin >> L;
    cin >> T;

    for (int i = 0; i < SIZE; i++) {
        for (int j = 0; j < SIZE; j++) {
            cin >> matriz[i][j];
        }
    }

    double result = 0;

    for (int j = 0; j < SIZE; j++){
        result += matriz[L][j];
    }

    if (T == 'M') {
        result /= SIZE;
    }

    cout << fixed << setprecision(1) << result << endl;

    return 0;
}