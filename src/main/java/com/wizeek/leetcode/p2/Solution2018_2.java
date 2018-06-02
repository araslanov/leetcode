package com.wizeek.leetcode.p2;

/**
 * Created by Artur on 6/2/2018.
 */
public class Solution2018_2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addNext(l1, l2, 0);
    }

    ListNode addNext(ListNode l1, ListNode l2, int more) {
        int sum = l1.val + l2.val + more;
        ListNode node = new ListNode(sum % 10);
        ListNode l1Next = l1.next;
        ListNode l2Next = l2.next;
        if (l1Next != null && l2Next != null) {
            node.next = addNext(l1Next, l2Next, sum / 10);
        } else if (l1Next == null && l2Next == null && sum / 10 > 0) {
            node.next = new ListNode(1);
        } else if (l1Next == null) {
            node.next = increment(l2Next, sum / 10);
        } else {
            node.next = increment(l1Next, sum / 10);
        }
        return node;
    }

    ListNode increment(ListNode node, int more) {
        if (more == 0) {
            return node;
        }
        if (node == null) {
            return new ListNode(1);
        }
        int sum = node.val + more;
        node.val = sum % 10;
        if (sum / 10 > 0) {
            node.next = increment(node.next, 1);
        }
        return node;
    }
}