package com.wizeek.leetcode;

public class Solution206_2 {
    private ListNode reverseHead;

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode tail = getTail(head);
        tail.next = null;
        return reverseHead;
    }

    private ListNode getTail(ListNode node) {
        if (node.next == null) {
            reverseHead = node;
            return node;
        }
        ListNode tail = getTail(node.next);
        tail.next = node;
        return node;
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
