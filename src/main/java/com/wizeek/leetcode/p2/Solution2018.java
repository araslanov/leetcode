package com.wizeek.leetcode.p2;

/**
 * Created by Artur on 6/2/2018.
 */
public class Solution2018 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addNext(l1, l2, 0);
    }

    ListNode addNext(ListNode l1, ListNode l2, int more) {
        int v1 = l1 == null ? 0 : l1.val;
        int v2 = l2 == null ? 0 : l2.val;
        int sum = v1 + v2 + more;
        ListNode node = new ListNode(sum % 10);
        if (l1 != null && l1.next != null || l2 != null && l2.next != null || sum / 10 > 0) {
            node.next = addNext(l1 == null ? null : l1.next, l2 == null ? null : l2.next, sum / 10);
        }
        return node;
    }
}