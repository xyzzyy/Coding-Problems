// https://leetcode.com/problems/valid-parentheses/submissions/706915529/

#include <stack>

class Solution {
public:
    bool isValid(string s) {
        if (s.length() % 2 == 1) return false;
        if (s[0] == ')' or s[0] == '}' or s[0] == ']') return false;
        stack<int> stax;
        for (char c:s){
            if (c == '('){
                stax.push(1);
            } else if (c == '{'){
                stax.push(2);
            } else if (c == '['){
                stax.push(3);
            } else if (c == ')'){
                if (stax.empty()) return false;
                if (stax.top() == 1){
                    stax.pop();
                } else return false;
            } else if (c == '}'){
                if (stax.empty()) return false;
                if (stax.top() == 2){
                    stax.pop();
                } else return false;
            } else if (c == ']'){
                if (stax.empty()) return false;
                if (stax.top() == 3){
                    stax.pop();
                } else return false;
            }
        }
        return stax.empty();
    }
};