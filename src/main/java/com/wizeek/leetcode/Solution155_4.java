package com.wizeek.leetcode;

public class Solution155_4 {
    private Node tail;

    public Solution155_4() {
    }

    public void push(int val) {
        if (tail == null) {
            tail = new Node(val, val);
        } else {
            tail.next = new Node(val, Math.min(val, tail.min));
            tail.next.previous = tail;
            tail = tail.next;
        }
    }

    public void pop() {
        tail = tail.previous;
        if (tail != null) {
            tail.next = null;
        }
    }

    public int top() {
        return tail.value;
    }

    public int getMin() {
        return tail.min;
    }

    private static class Node {
        int value;
        int min;
        Node next;
        Node previous;

        Node(int value, int min) {
            this.value = value;
            this.min = min;
        }
    }
}
