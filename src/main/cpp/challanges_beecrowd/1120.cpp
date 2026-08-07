#include <iostream>
#include <string>
#include <vector>

using namespace std;

int main() {
    char d;
    string n;

    while (cin >> d >> n) {
        if (d == '0' && n == "0") {
            break;
        }

        string v;

        for (char caractere : n) {
            if (caractere != d) {
                v += caractere;
            }
        }

        size_t pos = v.find_first_not_of('0');

        if (pos == string::npos) {
            cout << "0\n";
        } else {
            cout << v.substr(pos) << '\n';
        }
    }

    return 0;
}