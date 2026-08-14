#include <iostream>
#include <vector>
#include <unordered_map>
#include <string>
#include <algorithm>

using namespace std;

int maxEqualRowsAfterFlips(vector<vector<int>> &matrix) {
    unordered_map<string, int> patterns;
    int result = 0;

    for (const auto &row : matrix)
    {
        string pattern;

        for (int value : row)
        {
            int normalized = value ^ row[0];
            pattern += to_string(normalized);
        }

        patterns[pattern]++;

        result = max(result, patterns[pattern]);
    }

    return result;
}

int main() {
    
    return 0;
}