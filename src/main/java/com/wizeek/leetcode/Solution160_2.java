package com.wizeek.leetcode;

public class Solution160_2 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a0 = headA;
        ListNode b0 = headB;
        while (headA != headB) {
            if (headA == null) {
                headA = b0;
            } else {
                headA = headA.next;
            }
            if (headB == null) {
                headB = a0;
            } else {
                headB = headB.next;
            }
        }
        return headA;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
