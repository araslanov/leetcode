package com.wizeek.leetcode;

public class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode current = head;
        int currentValue = current.val;
        while (current.next != null) {
            int nextValue = current.next.val;
            if (nextValue == currentValue) {
                current.next = current.next.next;
            } else {
                current = current.next;
                currentValue = current.val;
            }
        }
        return head;
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
