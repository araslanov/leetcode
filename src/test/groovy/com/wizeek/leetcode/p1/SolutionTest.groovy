package com.wizeek.leetcode.p1

import org.junit.Before
import org.junit.Test

/**
 * Created by Artur on 6/2/2018.
 */
class SolutionTest {

    Solution2018 solution

    @Before
    void setUp() {
        solution = new Solution2018()
    }

    @Test
    void test1() {
        def result = solution.twoSum([2, 7, 11, 15] as int[], 9)

        assert result == [0, 1] as int []
    }

    @Test
    void test2() {
        def result = solution.twoSum([7, 0, -4, 10, 4] as int[], 0)

        assert result == [2, 4] as int []
    }

    @Test
    void test3() {
        def result = solution.twoSum([7, 0] as int[], 7)

        assert result == [0, 1] as int []
    }

    @Test
    void test4() {
        def result = solution.twoSum([3, 2, 2] as int[], 4)

        assert result == [1, 2] as int []
    }

    @Test
    void test5() {
        def result = solution.twoSum([3, 2, 3] as int[], 6)

        assert result == [0, 2] as int []
    }
}
