// https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/876514618/

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        final int strLen = s.length();
        int setlen = 0;
        for (int i = 0; i<strLen; i++){
            Set<Character> set = new HashSet<>();
            for (int j = 0; j<strLen - i; j++){
                if (j != set.size()) break;
                set.add(s.charAt(i + j));
            }
            setlen = Math.max(set.size(), setlen);
        }
        return setlen;
    }
}