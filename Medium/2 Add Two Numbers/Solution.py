# https://leetcode.com/problems/add-two-numbers/submissions/689827814/

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def getSum(self, node):
        current = node
        ans = str(current.val)
        while current.next is not None:
            current = current.next
            ans = str(current.val) + ans
        return ans
    
    def nodeify(self, number):
        next = None
        current = ListNode(val=int(number[0]),next=next)
        for i in range(1,len(number)):
            next = current
            current = ListNode(val=int(number[i]),next=next)
        return current
    
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        
        return self.nodeify(str(int(self.getSum(l1))+int(self.getSum(l2))))