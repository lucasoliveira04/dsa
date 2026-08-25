#include <iostream>

using namespace std;

int main() {
    int N;

    cin >> N;

    while (N--) {
        int F1, F2;

        cin >> F1 >> F2;

        while (F2 != 0) {
            int resto = F1 % F2;
            F1 = F2;
            F2 = resto;
        }

        cout << F1 << endl;
    }
}