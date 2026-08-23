#include <iostream>
#include <vector>

using namespace std;

void addZeroRight(vector<int> &vec, int i) {
    int ADD_VALOR = 0;
    vec.insert(vec.begin() + i + 1, ADD_VALOR);
}

void duplicateZeros(vector<int> &arr) {
    vector<int> indices;
    int tamanhoOriginal = arr.size();

    for (int i = 0; i < arr.size(); i++) {
        if (arr[i] == 0) {
            indices.push_back(i);
        }
    }

    for (int i = (int)indices.size() - 1; i >= 0; i--) {
        addZeroRight(arr, indices[i]);
    }

    while (arr.size() > tamanhoOriginal) {
        arr.pop_back();
    }
}

int main() {
    vector<int> arr = {1, 0, 2, 3, 0, 4, 5, 0};

    duplicateZeros(arr);

    for (int valor : arr) {
        cout << valor << " ";
    }

    cout << endl;

    return 0;
}