package com.wizeek.leetcode;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class Solution1656Test {

    @Test
    public void test1() {
        Solution1656 stream = new Solution1656(5);
        assertEquals(new LinkedList<>(), stream.insert(3, "ccccc"));
        assertEquals(new LinkedList<>(), stream.insert(1, "aaaaa"));
    }
}
