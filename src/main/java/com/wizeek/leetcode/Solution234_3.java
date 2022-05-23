package com.wizeek.leetcode;

public class Solution234_3 {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode secondHalf;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast.next == null) {
            secondHalf = slow;
        } else {
            secondHalf = slow.next;
            slow.next = null;
        }
        ListNode reverseHead = reverseList(secondHalf);
        while (head != null && reverseHead != null) {
            if (head.val != reverseHead.val) {
                return false;
            }
            head = head.next;
            reverseHead = reverseHead.next;
        }
        return true;
    }

    private ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode temp = null;
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
