package com.wizeek.leetcode.p2;

/**
 * Created by Artur on 6/2/2018.
 */
public class Solution2018_3 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addNext(l1, l2, 0);
    }

    ListNode addNext(ListNode l1, ListNode l2, int more) {
        if (l1 == null) {
            if (l2 == null) {
                return more > 0 ? new ListNode(1) : null;
            } else {
                return more > 0 ? increment(l2) : l2;
            }
        }
        if (l2 == null) {
            return more > 0 ? increment(l1) : l1;
        }
        int sum = l1.val + l2.val + more;
        l1.val = sum % 10;
        l1.next = addNext(l1.next, l2.next, sum / 10);
        return l1;
    }

    ListNode increment(ListNode node) {
        if (node == null) {
            return new ListNode(1);
        }
        int sum = node.val + 1;
        node.val = sum % 10;
        if (sum / 10 > 0) {
            node.next = increment(node.next);
        }
        return node;
    }
}