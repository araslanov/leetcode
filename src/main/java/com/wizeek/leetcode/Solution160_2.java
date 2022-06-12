package com.wizeek.leetcode;

public class Solution160_2 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a0 = headA;
        ListNode b0 = headB;
        boolean loopedA = false;
        boolean loopedB = false;
        while (headA != null || headB != null) {
            if (headA == headB) {
                return headA;
            }
            if (headA == null && !loopedA) {
                headA = b0;
                loopedA = true;
            } else if (headA != null) {
                headA = headA.next;
            }
            if (headB == null && !loopedB) {
                headB = a0;
                loopedB = true;
            } else if (headB != null) {
                headB = headB.next;
            }
        }
        return null;
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
