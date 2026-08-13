#include <iostream>

using namespace std;

int calls;

int fib(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;

    calls+=2;

    return fib(n - 1) + fib(n - 2);
}

int main() {
    int N;

    cin >> N;

    for (int i = 0; i < N; i++) {
        int x;
        cin >> x;
        calls = 0;
        int result = fib(x);
        cout << "fib(" << x << ") = " << calls << " calls = " << result << endl;
    }

    return 0;
}