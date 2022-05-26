package com.wizeek.leetcode;

import java.util.LinkedList;
import java.util.TreeMap;

public class Solution155_3 {
    private Node tail;
    private final TreeMap<Integer, LinkedList<Node>> minMap = new TreeMap<>();

    public Solution155_3() {
    }

    public void push(int val) {
        if (tail == null) {
            tail = new Node(val);
        } else {
            tail.next = new Node(val);
            tail.next.previous = tail;
            tail = tail.next;
        }
        LinkedList<Node> list = minMap.getOrDefault(val, new LinkedList<>());
        list.add(tail);
        minMap.put(val, list);
    }

    public void pop() {
        int value = tail.value;
        LinkedList<Node> list = minMap.get(value);
        list.remove(tail);
        if (list.isEmpty()) {
            minMap.remove(value);
        }
        tail = tail.previous;
        if (tail != null) {
            tail.next = null;
        }
    }

    public int top() {
        return tail.value;
    }

    public int getMin() {
        return minMap.firstKey();
    }

    private static class Node {
        int value;
        Node next;
        Node previous;

        Node(int value) {
            this.value = value;
        }
    }
}
