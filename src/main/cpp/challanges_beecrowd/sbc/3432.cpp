#include <iostream>

using namespace std;

int main() {
    int N;
    bool isBit = false;
    
    for (int i = 0; i < 7; i++) {
        cin >> N;
        if (N == 9) isBit = true;
    }

    if (isBit) {
        cout << "F" << endl;
    }
    else {
        cout << "S" << endl;
    }

    return 0;
}