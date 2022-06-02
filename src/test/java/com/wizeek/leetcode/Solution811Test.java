package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution811Test {

    private Solution811 solution;

    @Before
    public void setUp() {
        solution = new Solution811();
    }

    @Test
    public void test1() {
        List<String> result = solution.subdomainVisits(new String[]{"9001 discuss.leetcode.com"});

        assertEquals(3, result.size());
        assertEquals("9001 com", result.get(0));
        assertEquals("9001 leetcode.com", result.get(1));
        assertEquals("9001 discuss.leetcode.com", result.get(2));
    }

    @Test
    public void test2() {
        List<String> result = solution.subdomainVisits(
                new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"});

        assertEquals(7, result.size());
        assertEquals("951 com", result.get(0));
        assertEquals("900 google.mail.com", result.get(1));
        assertEquals("1 intel.mail.com", result.get(2));
        assertEquals("5 org", result.get(3));
        assertEquals("5 wiki.org", result.get(4));
        assertEquals("901 mail.com", result.get(5));
        assertEquals("50 yahoo.com", result.get(6));
    }
}
