#include <iostream>
#include <vector>
#include <set>
#include <map>
#include <iterator>

using namespace std;

bool uniqueOccurrences(vector<int> &arr){
    map<int, int> freq;
    set<int> ocorr;

    for (int i = 0; i < arr.size(); i++) {
        freq[arr[i]]++;
    }

    for (auto item : freq) {
        auto [it, inseriu] = ocorr.insert(item.second);

        if (!inseriu) {
            return false;
        }
    }

    return true;

}

int main() {
    vector<int> arr = {1, 2, 2, 1, 1, 3};

    cout << uniqueOccurrences(arr) << endl;

    return 0;
}