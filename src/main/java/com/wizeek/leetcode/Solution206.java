package com.wizeek.leetcode;

public class Solution206 {
    public ListNode reverseList(ListNode head) {
        ListNode temp = null;
        ListNode previous = null;
        while (head != null) {
            temp = head.next;
            head.next = previous;
            previous = head;
            head = temp;
        }
        return previous;
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
