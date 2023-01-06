// https://leetcode.com/problems/palindrome-number/submissions/705207438/

class Solution {
public:
    bool isPalindrome(int x) {
        
        if (x < 0) return false;
        if (x < 10) return true;
        std::string strforward = std::to_string(x);
        std::string strbackward = "";
        for (int i=strforward.length()-1; i>=0; i--){
            strbackward += strforward[i];
        }
        return (strforward == strbackward);
    }
};