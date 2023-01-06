// https://leetcode.com/problems/longest-common-prefix/submissions/690528463/

/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    let prefix = '';
    let testchar = '';
    let min = 201;
    
    for (let i=0; i<strs.length; i++){
        if (strs[i].length < min){
            min = strs[i].length;
        }
    }
    
    for (let i=0; i<min; i++){ // loop through chars that exist for all strings
        testchar = strs[0].substring(i,i+1);
        for (let j=1; j<strs.length; j++){ // loop through all other strings
            if (prefix.concat(testchar) != strs[j].substring(0,i+1)){
                return prefix;
            }
        }
        prefix = prefix.concat(testchar);
    }
    
    return prefix;
};