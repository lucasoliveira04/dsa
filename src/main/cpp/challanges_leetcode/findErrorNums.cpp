#include <iostream>
#include <algorithm>
#include <set>
#include <vector>
#include <iterator>

using namespace std;

vector<int> findErrorNums(vector<int>& nums) {
    set<int> numsSet;
    vector<int> result;

    // encontra o repetido
    for (int n : nums) {
        auto [it, inseriu] = numsSet.insert(n);

        if (!inseriu) {
            result.push_back(n);
        }
    }

    // encontra o que está faltando
    for (int i = 1; i <= nums.size(); i++) {

        if (numsSet.find(i) == numsSet.end()) {
            result.push_back(i);
        }
    }

    return result;
}

int main() {
    vector<int> nums = {1, 1};

    vector<int> result = findErrorNums(nums);

    for (int n : result) {
        cout << n << endl;
    }

    return 0;
}