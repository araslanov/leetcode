package com.wizeek.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class Solution234 {
    public boolean isPalindrome(ListNode head) {
        ListNode node = head;
        Deque<Integer> stack = new LinkedList<>();
        while (node != null) {
            stack.addFirst(node.val);
            node = node.next;
        }
        node = head;
        while (node != null) {
            Integer reverse = stack.pollFirst();
            if (node.val != reverse) {
                return false;
            }
            node = node.next;
        }
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
