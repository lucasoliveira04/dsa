#include "vector"
#include "iostream"
#include "algorithm"

using namespace std;

int main() {
    vector<int> nums1 = {2, 1};
    vector<int> nums2 = {1, 2};
    vector<int> result;

    for (int i = 0; i < nums1.size(); i++) {
        for (int j = 0; j < nums2.size(); j++) {
            if (nums1[i] == nums2[j]) {
                result.push_back(nums1[i]);
            }
        }
    }

    // sort(result.begin(), result.end());

    int n = result.size();
    bool trocou = true;

    while (trocou) {
        trocou = false;

        int first = 0;
        int second = 1;
        int inc = 0;

        while (inc < n - 1) {
            if (result[second] < result[first]) {
                int temp = result[first];
                result[first] = result[second];
                result[second] = temp;
                trocou = true;
            }

            first++;
            second++;
            inc++;
        }

        n--;
    }

    // result.erase(unique(result.begin(), result.end()), result.end());

    for (int i = 0; i < result.size(); i++) {
        int j = i + 1;
        while (j < result.size()) {
            if (result[j] == result[i]) {
                result.erase(result.begin() + j);
            } else {
                j++;
            }
        }
    }

    for (int n : result) {
        cout << n << " ";
    }
}
