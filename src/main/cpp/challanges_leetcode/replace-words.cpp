#include <iostream>
#include <vector>
#include <string>
#include <cctype>

using namespace std;

string replaceWords(vector<string> &dictionary, string sentence) {

    vector<string> palavras;
    string palavra = "";

    for (int i = 0; i < sentence.length(); i++) {

        if (!isspace(sentence[i])) {
            palavra += sentence[i];
        }
        else {
            palavras.push_back(palavra);
            palavra = "";
        }
    }

    palavras.push_back(palavra);

    for (int i = 0; i < palavras.size(); i++) {

        string menorRaiz = "";

        for (int j = 0; j < dictionary.size(); j++) {

            if (dictionary[j].size() > palavras[i].size()) {
                continue;
            }

            bool igual = true;

            for (int k = 0; k < dictionary[j].size(); k++) {

                if (palavras[i][k] != dictionary[j][k]) {
                    igual = false;
                    break;
                }
            }

            if (igual) {
                if (menorRaiz == "" || dictionary[j].size() < menorRaiz.size()) {

                    menorRaiz = dictionary[j];
                }
            }
        }

        if (menorRaiz != "") {
            palavras[i] = menorRaiz;
        }
    }

    string resultado = "";

    for (int i = 0; i < palavras.size(); i++) {

        resultado += palavras[i];

        if (i < palavras.size() - 1) {
            resultado += " ";
        }
    }

    return resultado;
}

int main()
{

    vector<string> dictionary = { "catt", "cat", "bat", "rat"};

    string sentence = "the cattle was rattled by the battery";

    cout << replaceWords(dictionary, sentence) << endl;

    return 0;
}