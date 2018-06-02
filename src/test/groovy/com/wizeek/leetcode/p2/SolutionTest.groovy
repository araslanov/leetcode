package com.wizeek.leetcode.p2

import org.junit.Before
import org.junit.Test

/**
 * Created by Artur on 6/2/2018.
 */
class SolutionTest {

    Solution2018_3 solution

    @Before
    void setUp() {
        solution = new Solution2018_3()
    }

    @Test
    void test1() {
        def list1 = new ListNode(2).with {
            next = new ListNode(4).with {
                next = new ListNode(3)
                it
            }
            it
        }
        def list2 = new ListNode(5).with {
            next = new ListNode(6).with {
                next = new ListNode(4)
                it
            }
            it
        }

        def result = solution.addTwoNumbers(list1, list2)

        assert result == new ListNode(7).with {
            next = new ListNode(0).with {
                next = new ListNode(8)
                it
            }
            it
        }
    }

    @Test
    void test2() {
        def list1 = new ListNode(2)
        def list2 = new ListNode(5).with {
            next = new ListNode(6).with {
                next = new ListNode(4)
                it
            }
            it
        }

        def result = solution.addTwoNumbers(list1, list2)

        assert result == new ListNode(7).with {
            next = new ListNode(6).with {
                next = new ListNode(4)
                it
            }
            it
        }
    }

    @Test
    void test3() {
        def list1 = new ListNode(5)
        def list2 = new ListNode(5)

        def result = solution.addTwoNumbers(list1, list2)

        assert result == new ListNode(0).with {
            next = new ListNode(1)
            it
        }
    }

    @Test
    void test4() {
        def list1 = new ListNode(5)
        def list2 = new ListNode(5).with {
            next = new ListNode(9)
            it
        }

        def result = solution.addTwoNumbers(list1, list2)

        assert result == new ListNode(0).with {
            next = new ListNode(0).with {
                next = new ListNode(1)
                it
            }
            it
        }
    }

    @Test
    void test5() {
        def list1 = new ListNode(5)
        def list2 = new ListNode(5).with {
            next = new ListNode(9).with {
                next = new ListNode(3)
                it
            }
            it
        }

        def result = solution.addTwoNumbers(list1, list2)

        assert result == new ListNode(0).with {
            next = new ListNode(0).with {
                next = new ListNode(4)
                it
            }
            it
        }
    }

    @Test
    void test6() {
        def list1 = new ListNode(1).with {
            next = new ListNode(8)
            it
        }
        def list2 = new ListNode(0)

        def result = solution.addTwoNumbers(list1, list2)

        assert result == new ListNode(1).with {
            next = new ListNode(8)
            it
        }
    }
}
