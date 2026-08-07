//
// Created by lucas on 21/10/2025.
//

#include "iostream"

using namespace std;

int main() {
    int N;
    cin >> N;

    if (N <= 0 || N > 46) return 0;

    int a = 0, b = 1, c;

    cout << a;
    if (N > 1) cout << " " << b;

    for (int i =2; i < N; i++) {
        c = a + b;
        cout << " " << c;
        a = b;
        b = c;
    }

    cout << endl;
    return 0;
}
