// Author: Mustain Murtaza Taib
// LeetCode Problem: Add Two Numbers
// Problem Link: https://leetcode.com/problems/add-two-numbers/description/
// Topics: Linked List, Math, Recursion
// Type: Medium
// Accepted

// "*" single star means learned code
// "**" double star means learned code and algorithm or data-staructure

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

    ListNode make_node(int value) {
        return new ListNode(value, null);
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0, sum;
        ListNode head = null;
        ListNode current_node = null;
        ListNode temp_l1 = l1;
        ListNode temp_l2 = l2;

        while(temp_l1 != null && temp_l2 != null) {
            sum = (temp_l1.val + temp_l2.val + carry) % 10;
            carry = (temp_l1.val + temp_l2.val + carry) / 10;

            temp_l1 = temp_l1.next;
            temp_l2 = temp_l2.next;

            ListNode new_node = make_node(sum);

            if(head == null) 
                head = new_node;
            else
                current_node.next = new_node;
                
            current_node = new_node;
        }

        temp_l1 = temp_l1 != null ? temp_l1 : temp_l2;

        while(temp_l1 != null) {
            sum = (temp_l1.val + carry) % 10;
            carry = (temp_l1.val + carry) / 10;

            temp_l1 = temp_l1.next;

            ListNode new_node = make_node(sum);
            current_node.next = new_node;
            current_node = new_node;
        }

        if(carry == 1) 
            current_node.next = make_node(1);

        return head;
    }
}
