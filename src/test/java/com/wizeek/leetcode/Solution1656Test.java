package com.wizeek.leetcode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution1656Test {

    @Test
    public void test1() {
        Solution1656 stream = new Solution1656(5);
        assertEquals(List.of(), stream.insert(3, "ccccc"));
        assertEquals(List.of("aaaaa"), stream.insert(1, "aaaaa"));
        assertEquals(List.of("bbbbb", "ccccc"), stream.insert(2, "bbbbb"));
        assertEquals(List.of(), stream.insert(5, "eeeee"));
        assertEquals(List.of("ddddd", "eeeee"), stream.insert(4, "ddddd"));
    }
}
