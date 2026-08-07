#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int main() {
    int n;
    cin >> n;

    cin.ignore();

    while (n--) {
        string texto;
        getline(cin, texto);

        // primeira vez
        for (int i = 0; i < texto.size(); i++) {
            if ((texto[i] >= 'a' && texto[i] <= 'z') || 
            (texto[i] >= 'A' && texto[i] <= 'Z')) {
                texto[i] += 3;
            }
        }

        // segunda
        reverse(texto.begin(), texto.end());

        // terceira
        for (int i = texto.size() / 2; i < texto.size(); i++) {
            texto[i] -= 1;
        }

        cout << texto << endl;
    }

    return 0;
}