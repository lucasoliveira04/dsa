#include <iostream>
#include <vector>
#include <algorithm>
#include <functional>

using namespace std;

int main() {
    vector<int> vec;

    int valorCarta1, valorCarta2, valorCarta3, valorCarta4, valorCarta5;
    cin >> valorCarta1 >> valorCarta2 >> valorCarta3 >> valorCarta4 >> valorCarta5;
    vec.insert(vec.end(), valorCarta1);
    vec.insert(vec.end(), valorCarta2);
    vec.insert(vec.end(), valorCarta3);
    vec.insert(vec.end(), valorCarta4);
    vec.insert(vec.end(), valorCarta5);

    bool crescente = is_sorted(vec.begin(), vec.end());
    bool decrescente = is_sorted(vec.begin(), vec.end(), greater<int>());

    if (crescente) {
        cout << "C" << endl;
    } else if (decrescente) {
        cout << "D" << endl;
    } else {
        cout << "N" << endl;
    }

    return 0;
}