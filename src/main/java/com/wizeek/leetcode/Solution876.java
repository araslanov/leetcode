package com.wizeek.leetcode;

public class Solution876 {
    public ListNode middleNode(ListNode head) {
        ListNode middle = head;
        int count = 1;
        while (head.next != null) {
            head = head.next;
            count++;
            if (count % 2 == 0) {
                middle = middle.next;
            }
        }
        return middle;
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
