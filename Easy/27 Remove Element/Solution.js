// https://leetcode.com/problems/remove-element/submissions/691425007/

/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function(nums, val) {
    let len = nums.length;
    for (let i=0; i<len; i++){
        let cur = nums.shift();
        if (cur !== val) {
            nums.push(cur);
        }
    }
    return nums.length;
};