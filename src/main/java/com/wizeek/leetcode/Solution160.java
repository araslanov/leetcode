package com.wizeek.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> visitedA = new HashSet<>();
        Set<ListNode> visitedB = new HashSet<>();
        while (headA != null || headB != null) {
            if (visitedB.contains(headA)) {
                return headA;
            }
            if (headA != null) {
                visitedA.add(headA);
                headA = headA.next;
            }
            if (visitedA.contains(headB)) {
                return headB;
            }
            if (headB != null) {
                visitedB.add(headB);
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
