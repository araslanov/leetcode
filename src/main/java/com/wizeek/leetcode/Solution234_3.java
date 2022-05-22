package com.wizeek.leetcode;

public class Solution234_3 {
    private ListNode left;

    public boolean isPalindrome(ListNode head) {
        left = head;
        return isPalindromeRecursive(head);
    }

    private boolean isPalindromeRecursive(ListNode node) {
        if (node == null) {
            return true;
        }
        if (!isPalindromeRecursive(node.next)) {
            return false;
        }
        if (left.val != node.val) {
            return false;
        }
        left = left.next;
        return true;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
