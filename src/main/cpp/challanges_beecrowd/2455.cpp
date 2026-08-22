#include <iostream>

using namespace std;

int main() {

    int p1, p2, c1, c2;

    cin >> p1 >> c1 >> p2 >> c2;

    int resultLeft = p1 * c1;
    int resultRight = p2 * c2;

    if (resultLeft == resultRight) {
        cout << "0" << endl;
    } else if (resultRight > resultLeft) {
        cout << "1" << endl;
    } else if (resultLeft > resultRight) {
        cout << "-1" << endl;
    }

    return 0;
}