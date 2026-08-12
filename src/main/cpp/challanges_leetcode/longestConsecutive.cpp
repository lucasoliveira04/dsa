#include <iostream>
#include <vector>
#include <algorithm>
#include <unordered_set>

using namespace std;

int longestConsecutive(vector<int>& nums) {
    unordered_set<int> numeros(nums.begin(), nums.end());

    int maior = 0; 

    for (int n : numeros) {
        if (numeros.find(n - 1) == numeros.end()) {
            int atual = n;
            int tamanho = 1;

            while (numeros.find(atual + 1) != numeros.end()) {
                atual++;
                tamanho++;
            }

            maior = max(maior, tamanho);
        }
    }

    return maior+1;
}

int main() {
    vector<int> nums = {100, 4, 200, 1, 3, 2};

    cout << longestConsecutive(nums) << endl;

    return 0;
}