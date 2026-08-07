#include <iostream>
#include <algorithm>
#include <unordered_set>
#include <vector>

using namespace std;

int main() {
    vector<string> morse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.",
            "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--.."
        };

    unordered_set<string> transforms;

    for (const string& palavra : words) {
        string codigo;

        for (char letra : palavra) {
            codigo += morse[letra - 'a'];
        }

        transforms.insert(codigo);
        
    }

    return transforms.size();
}