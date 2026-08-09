#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int N, Q;
    int caso = 1;

    while (cin >> N >> Q) {
        if (N == 0 && Q == 0) {
            break;
        }

        vector<int> marbles(N);

        for (int i = 0; i < N; i++) {
            cin >> marbles[i];
        }

        sort(marbles.begin(), marbles.end());

        cout << "CASE# " << caso << ":" << endl;

        for (int i = 0; i < Q; i++) {
            int numero;
            cin >> numero;

            auto it = lower_bound(
                marbles.begin(),
                marbles.end(),
                numero
            );

            if (it != marbles.end() && *it == numero) {
                int posicao = it - marbles.begin() + 1;
                
                cout << numero
                     << " found at "
                     << posicao
                     << endl;
            } else {
                cout << numero 
                     << " not found"
                     << endl;
            }
        }

        caso++;
    }

    return 0;
}