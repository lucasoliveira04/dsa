#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;



int findContentChildren(vector<int>& g, vector<int>& s) {
    sort(g.begin(), g.end());
    sort(s.begin(), s.end());
    
    int filho = 0;
    int biscoito = 0;

    while (filho < (int)g.size() && biscoito < (int)s.size()) {
        if (s[biscoito] >= g[filho]) {
            ++filho;
        } 

        ++biscoito;
    }

    return filho;

}

int main() {
    vector<int> g = {1, 2, 3};
    vector<int> s = {1, 1};

    cout << findContentChildren(g, s) << '\n';

    return 0;
}