package com.wizeek.leetcode.p2;

/**
 * Created by Artur on 6/2/2018.
 */
public class Solution2016 {
    byte sum = 0;
    byte over = 0;
    byte sumVal = 0;
    byte l1Val = 0;
    byte l2Val = 0;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return recurse(l1, l2);
    }

    private ListNode recurse(ListNode l1, ListNode l2) {
        l1Val = l1 == null ? 0 : (byte) l1.val;
        l2Val = l2 == null ? 0 : (byte) l2.val;
        sum = (byte) (l1Val + l2Val + over);
        over = (byte) (sum / 10);
        sumVal = (byte) (sum % 10);
        ListNode lSum = new ListNode(sumVal);
        if ((l1 == null || l1.next == null) && (l2 == null || l2.next == null) && over == 0) {
            lSum.next = null;
        } else {
            lSum.next = recurse(l1 == null ? null : l1.next, l2 == null ? null : l2.next);
        }
        return lSum;
    }
}
