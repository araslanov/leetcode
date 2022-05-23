package com.wizeek.leetcode;

import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class Solution716_2 {
    private final TreeMap<Integer, LinkedList<Node>> maxMap = new TreeMap<>();
    private Node tail;

    public Solution716_2() {
    }

    public void push(int x) {
        Node newNode = new Node(x);
        if (tail != null) {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        LinkedList<Node> nodes = maxMap.get(x);
        if (nodes == null) {
            nodes = new LinkedList<>();
        }
        nodes.addFirst(newNode);
        maxMap.put(x, nodes);
    }

    public int pop() {
        if (tail == null) {
            return 0;
        }
        int value = tail.value;
        tail = tail.previous;
        if (tail != null) {
            tail.next = null;
        }
        LinkedList<Node> nodes = maxMap.get(value);
        nodes.pollFirst();
        if (nodes.isEmpty()) {
            maxMap.remove(value);
        }
        return value;
    }

    public int top() {
        return tail.value;
    }

    public int peekMax() {
        return maxMap.lastKey();
    }

    public int popMax() {
        Map.Entry<Integer, LinkedList<Node>> maxEntry = maxMap.lastEntry();
        LinkedList<Node> nodes = maxEntry.getValue();
        Node maxNode = nodes.pollFirst();
        if (nodes.isEmpty()) {
            maxMap.pollLastEntry();
        }
        if (maxNode.previous != null) {
            maxNode.previous.next = maxNode.next;
        }
        if (maxNode.next != null) {
            maxNode.next.previous = maxNode.previous;
        }
        if (tail == maxNode) {
            tail = maxNode.previous;
        }
        return maxEntry.getKey();
    }

    private static class Node {
        int value;
        Node previous;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
}
