#include <iostream>
#include <vector>
#include <unordered_map>
#include <algorithm>

using namespace std;

int main() {

    vector<int> nums = {1, 2, 3, 4, 5, 6};
   
    unordered_map<int, int> frequencia;
    unordered_map<int, int> primeira;
    unordered_map<int, int> ultima;

    int maiorFrequencia = 0;

    for (int i = 0; i < nums.size(); i++) {
        int numero = nums[i];

        frequencia[numero]++;

        if (primeira.find(numero) == primeira.end()) {
            primeira[numero] = i;
        }

        ultima[numero] = i;

        maiorFrequencia = max(
            maiorFrequencia,
            frequencia[numero]
        );
    }

    int menorTamanho = nums.size();

    for (auto item : frequencia) {
        int numero = item.first;
        int quantidade = item.second;

        if (quantidade == maiorFrequencia) {
            int tamanho = ultima[numero] - primeira[numero] + 1;
            menorTamanho = min(menorTamanho, tamanho);
        }
    }

    return menorTamanho;

}