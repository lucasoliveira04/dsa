#include "iostream"

using namespace std;

int main() {
    int n, i = 0, j = 0;

    cin >> n;

    while (j < 1000) {
        cout << "N[" << j << "] = " << i++ << endl;
        if (i == n) {
            i = 0;
        }
        j++;
    }


    return 0;
}
