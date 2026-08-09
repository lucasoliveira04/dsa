#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <cctype>
#include <unordered_map>

using namespace std;

vector<string> findWords(vector<string>& words) {
    unordered_map<char, int> teclado;
    for (char c : string("qwertyuiop")) {
        teclado[c] = 1;
    }
    for (char c : string("asdfghjkl")) {
        teclado[c] = 2;
    }
    for (char c : string("zxcvbnm")) {
        teclado[c] = 3;
    }
    vector<string> result;
    for (string word : words) {
        char primeiraLetra = static_cast<char>(tolower(word[0]));
        int linha = teclado[primeiraLetra];
        bool mesmaLinha = true;
        for (int i = 1; i < word.size(); i++) {
            char letra = static_cast<char>(tolower(word[i]));
            if (teclado[letra] != linha) {
                mesmaLinha = false;
                break;
            }
        }
        if (mesmaLinha) {
            result.push_back(word);
        }
    }
    return result;
}

int main() {



    return 0;
}