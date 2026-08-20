#include <iostream>
#include <vector>
#include <string>

using namespace std;

bool isPrefixString(string s, vector<string> &words) {
    string temp = "";

    for (int i = 0; i < words.size(); i++) {
        temp += words[i];

        if (temp == s) return true;

        if (temp.size() > s.size()) return false;
    }

    return false;
}

int main()
{
    string s = "iloveleetcode";

    vector<string> words = {
        "i",
        "love",
        "leetcode",
        "apples"};

    bool result = isPrefixString(s, words);

    if (result)
    {
        cout << "true" << endl;
    }
    else
    {
        cout << "false" << endl;
    }

    return 0;
}