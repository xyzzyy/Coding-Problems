// https://leetcode.com/problems/add-two-numbers/submissions/689817784/

import java.math.BigInteger;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    private String getSum(ListNode node){
        ListNode current = node;
        String sum = Integer.toString(current.val);
        while (current.next != null){
            current = current.next;
            sum = Integer.toString(current.val) + sum;
            System.out.println("Current sum is: " + sum);
        }
        return sum;
    }
    
    private ListNode nodeify(String str){
        ListNode next = null;
        ListNode current = new ListNode(Character.getNumericValue(str.charAt(0)), next);
        for (int i = 1; i < str.length(); i++) {
            next = current;
            current = new ListNode(Character.getNumericValue(str.charAt(i)), next);
        }
        return current;
        
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger num1 = new BigInteger(getSum(l1));
        BigInteger num2 = new BigInteger(getSum(l2));
        System.out.println(num1);
        System.out.println(num2);
        BigInteger sum = num1.add(num2);
        System.out.println(sum);
        return nodeify(sum.toString());
    }
}