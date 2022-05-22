package com.wizeek.leetcode;

import java.util.LinkedList;

public class Solution234_2 {
    public boolean isPalindrome(ListNode head) {
        LinkedList<Integer>[] positions = new LinkedList[10];
        int i = 0;
        while (head != null) {
            if (positions[head.val] == null) {
                positions[head.val] = new LinkedList<>();
            }
            positions[head.val].add(i);
            i++;
            head = head.next;
        }
        for (LinkedList<Integer> position : positions) {
            if (position == null) {
                continue;
            }
            int size = position.size();
            while (!position.isEmpty()) {
                Integer left = position.pollFirst();
                Integer right = position.pollLast();
                if (right == null) {
                    right = left;
                }
                if (left + right != i - 1) {
                    return false;
                }
            }
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
