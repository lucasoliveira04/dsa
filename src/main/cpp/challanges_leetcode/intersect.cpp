#include <iostream>
#include <vector>
#include <map>

using namespace std;

vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
    vector<int> result;

    map<int, int> frequencia;

    for (int n : nums1) {
        frequencia[n]++;
    }

    for (int n : nums2) {
        if (frequencia[n] > 0) {
            result.push_back(n);
            frequencia[n]--;
        }
    }

    return result;
}

int main() {


    return 0;
}