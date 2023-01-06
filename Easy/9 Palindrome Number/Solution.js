// https://leetcode.com/problems/palindrome-number/submissions/691453482/

/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = (x) => {
    if (x < 0) return false;
    let strforward = x.toString();
    let strbackward = "";
    for (let i=strforward.length-1; i>=0; i--){
        strbackward += strforward[i];
    }
    return (strforward === strbackward);
};