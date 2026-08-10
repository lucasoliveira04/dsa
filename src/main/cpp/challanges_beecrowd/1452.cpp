#include <iostream>
#include <map>
#include <set>
#include <string>

using namespace std;

int main() {
    int n, m;

    while (cin >> n >> m) {

        if (n == 0 && m == 0) {
            break;
        }

        map<string, set<int>> aplicacaoServidores;

        // Lê os servidores
        for (int servidor = 0; servidor < n; servidor++) {

            int quantidade;
            cin >> quantidade;

            for (int j = 0; j < quantidade; j++) {

                string aplicacao;
                cin >> aplicacao;

                aplicacaoServidores[aplicacao].insert(servidor);
            }
        }

        long long soma = 0;

        // Lê as consultas
        for (int i = 0; i < m; i++) {

            int quantidade;
            cin >> quantidade;

            set<int> servidoresEncontrados;

            for (int j = 0; j < quantidade; j++) {

                string aplicacao;
                cin >> aplicacao;

                if (aplicacaoServidores.count(aplicacao)) {

                    for (int servidor : aplicacaoServidores[aplicacao]) {
                        servidoresEncontrados.insert(servidor);
                    }
                }
            }

            soma += servidoresEncontrados.size();
        }

        cout << soma << '\n';
    }

    return 0;
}