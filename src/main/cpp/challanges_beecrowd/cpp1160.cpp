// Created by lucas on 21/10/2025.
//
#include <iostream>
using namespace std;

int main() {
    int T;
    cin >> T;

    for (int i = 0; i < T; i++) {
        int pa, pb;
        double g1, g2;
        cin >> pa >> pb >> g1 >> g2;

        int anos = 0;

        while (pa <= pb && anos <= 100) {
            pa += int(pa * (g1 / 100));
            pb += int(pb * (g2 / 100));
            anos++;
        }

        if (anos > 100)
            cout << "Mais de 1 seculo." << endl;
        else
            cout << anos << " anos." << endl;
    }

    return 0;
}
