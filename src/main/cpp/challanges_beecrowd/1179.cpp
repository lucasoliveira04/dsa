#include <iostream>
#include <vector>

using namespace std;

void exibirVetor(const vector<int>& vec, int i = 0) {
    if (i == vec.size()) {
        return;
    }

    if (vec[i] % 2 == 0) {
        cout << "par[" << i << "] = " << vec[i] << endl;
    }
    else {
        cout << "impar[" << i << "] = " << vec[i] << endl;
    }

    exibirVetor(vec, i + 1);
}

int main() {
    vector<int> par;
    vector<int> impar;

    int reps = 15;
    int TAMANHO_MAXIMO = 5;

    for (int i = 1; i <= reps; i++) {
        int valor;
        cin >> valor;

        if (valor % 2 == 0) {
            par.push_back(valor);
        } else {
            impar.push_back(valor);
        }

        if (impar.size() == 5) {
            exibirVetor(impar);
            impar.clear();
        }

        if (par.size() == 5) {
            exibirVetor(par);
            par.clear();
        }   
    }

    exibirVetor(impar);
    exibirVetor(par);

    return 0;
}