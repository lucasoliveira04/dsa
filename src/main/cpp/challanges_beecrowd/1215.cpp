#include <iostream>
#include <string>
#include <set>
#include <cctype>

using namespace std;

int main () {
    set<string> palavras;
    string linha;

   while (getline(cin, linha)) {
        string palavra = "";

        for (char c : linha) {

            if (isalpha(c)) {
                palavra += tolower(c);
            } else {
                if (!palavra.empty()) {
                    palavras.insert(palavra);
                    palavra.clear();
                }
            }
        }

        if (!palavra.empty()) {
            palavras.insert(palavra);
        }
    }

    for (const string& palavra : palavras) {
        cout << palavra << '\n';
    }

    return 0;
}