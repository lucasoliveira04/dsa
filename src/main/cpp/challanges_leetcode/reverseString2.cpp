#include <iostream>
#include <string>

using namespace std;

int main() {

    string s = "abcdefg";
    int k = 2;
    int i = 0;

    while (i < s.length()) {
        int esquerda = i;
        int direita = i + k - 1;

        if (direita >= s.length()) {
            direita = s.length() - 1;
        }

        while (esquerda < direita) {
            char temp = s[esquerda];
            s[esquerda] = s[direita];
            s[direita] = temp;

            esquerda++;
            direita--;
        }

        i += 2 * k;
    }

    cout << s << endl;

    return 0;
}
