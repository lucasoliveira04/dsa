#include <iostream>
#include <vector>
#include <string>

using namespace std;

struct TreeNode {
    int val;
    TreeNode* left;
    TreeNode* right;

    TreeNode() : val(0), left(nullptr), right(nullptr) {}

    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}

    TreeNode(int x, TreeNode* left, TreeNode* right)
        : val(x), left(left), right(right) {}
};

class Solution {
public:
    void dfs(TreeNode* node, string caminho, vector<string>& result) {
        if (node == nullptr) {
            return;
        }

        if (!caminho.empty()) {
            caminho += "->";
        }

        caminho += to_string(node->val);

        if (node->left == nullptr && node->right == nullptr) {
            result.push_back(caminho);
            return;
        }

        if (node->left != nullptr) {
            dfs(node->left, caminho, result);
        }

        if (node->right != nullptr) {
            dfs(node->right, caminho, result);
        }
    }

    vector<string> binaryTreePaths(TreeNode* root) {
        vector<string> result;

        dfs(root, "", result);
        return result;
    }
};

int main() {

    TreeNode* root = new TreeNode(1);

    root->left = new TreeNode(2);
    root->right = new TreeNode(3);

    root->left->right = new TreeNode(5);

    Solution solution;

    vector<string> resultado = solution.binaryTreePaths(root);

    for (string caminho : resultado) {
        cout << caminho << endl;
    }

    delete root->left->right;
    delete root->left;
    delete root->right;
    delete root;

    return 0;
}