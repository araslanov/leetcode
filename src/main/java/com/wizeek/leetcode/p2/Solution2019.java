package com.wizeek.leetcode.p2;

public class Solution2019 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode trackingResult = result;
        int i1;
        int i2;
        int sum;
        int extra = 0;
        while (l1 != null || l2 != null || extra > 0) {
            i1 = l1 == null ? 0 : l1.val;
            i2 = l2 == null ? 0 : l2.val;
            sum = i1 + i2 + extra;
            extra = sum / 10;
            result.next = new ListNode(sum % 10);
            result = result.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return trackingResult.next;
    }
}
