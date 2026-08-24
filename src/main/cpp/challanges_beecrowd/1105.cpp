#include <iostream>
#include <vector>

using namespace std;

int main() {
    while (true) {
        int B, N;

        cin >> B >> N;

        if (B == 0 && N == 0) {
            break;
        }

        vector<int> reservas(B);

        // reserva inicial
        for (int i = 0; i < B; i++) {
            cin >> reservas[i];
        }

        // calcula as debenturas
        for (int i = 0; i < N; i++) {
            int D, C, V;

            cin >> D >> C >> V;

            reservas[D - 1] -= V;
            reservas[C - 1] += V;
        }

        bool temMoney = true;

        for (int saldo : reservas) {
            if (saldo < 0) {
                temMoney = false;
            }
        }

        if (temMoney) {
            cout << "S" << endl;
        } else {
            cout << "N" << endl;
        }

    }

    return 0;
}