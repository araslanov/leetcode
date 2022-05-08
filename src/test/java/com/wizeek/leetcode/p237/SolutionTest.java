package com.wizeek.leetcode.p237;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        Solution.ListNode node = new Solution.ListNode(5);
        node.next = new Solution.ListNode(1);
        node.next.next = new Solution.ListNode(9);

        solution.deleteNode(node);

        assertEquals(1, node.val);
        assertEquals(9, node.next.val);
    }
}
