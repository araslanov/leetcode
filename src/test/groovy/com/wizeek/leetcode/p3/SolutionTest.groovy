package com.wizeek.leetcode.p3

import org.junit.Before
import org.junit.Test

/**
 * Created by Artur on 6/2/2018.
 */
class SolutionTest {

    Solution solution

    @Before
    void setUp() {
        solution = new Solution()
    }

    @Test
    void test1() {
        assert solution.lengthOfLongestSubstring('abcabcbb') == 3 // abc
    }

    @Test
    void test2() {
        assert solution.lengthOfLongestSubstring('bbbbb') == 1 // b
    }

    @Test
    void test3() {
        assert solution.lengthOfLongestSubstring('pwwkew') == 3 // wke
    }

    @Test
    void test4() {
        assert solution.lengthOfLongestSubstring('abcabcdb') == 4 // abcd
    }
}
