package com.wizeek.leetcode;

public class Solution21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = null;
        ListNode previous = null;
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                if (previous == null) {
                    result = list2;
                    previous = list2;
                } else {
                    previous.next = list2;
                    previous = list2;
                }
                list2 = list2.next;
                break;
            }
            if (list2 == null) {
                if (previous == null) {
                    result = list1;
                    previous = list1;
                } else {
                    previous.next = list1;
                    previous = list1;
                }
                list1 = list1.next;
                break;
            }
            if (list1.val <= list2.val) {
                if (previous == null) {
                    result = list1;
                    previous = list1;
                } else {
                    previous.next = list1;
                    previous = list1;
                }
                list1 = list1.next;
            } else {
                if (previous == null) {
                    result = list2;
                    previous = list2;
                } else {
                    previous.next = list2;
                    previous = list2;
                }
                list2 = list2.next;
            }
        }
        return result;
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
