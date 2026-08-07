#include <iostream>
#include <vector> 

using namespace std;

int main() {
    int n, r;

    while (cin >> n >> r) {
        vector<bool> voltou(n + 1, false);
        
        for (int i = 0; i < r; i++) {
            int id;
            cin >> id;
            voltou[id] = true;
        }

        bool faltaAlguem = false;

        for (int i = 1; i <= n; i++) {
            if (!voltou[i]) {
                cout << i << " ";
                faltaAlguem = true;
            }
        }

        if (!faltaAlguem) {
            cout << "*";
        }

        cout << "\n";
    }

    return 0;
}
