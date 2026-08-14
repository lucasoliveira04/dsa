#include <iostream>
#include <vector>

using namespace std;

int main() {
    int P, N;
    bool isWin = false;
    vector<int> canos(N);

    if (P < 1 || P > 10) return;
    if (N < 2 || N > 100) return;
    
    cin >> P >> N;

    for (int i = 0; i < N; i++)
    {
        cin >> canos[i];
    }

    for (int i = 1; i <= N; i++) {
        if (abs(canos[i] - canos[i + 1]) > P) {
            isWin = false;
            break;
        }
    }

    if (isWin) {
        cout << "YOU WIN" << endl;
    } else  {
        cout << "GAME OVER" << endl;
    }

    return 0;
}