package com.wizeek.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution146_3 {
    private final int capacity;
    private final Map<Integer, Node> map = new HashMap<>();

    private Node head;
    private Node tail;

    public Solution146_3(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        Node node = map.get(key);
        if (node == null) {
            return -1;
        }
        markUsed(node);
        return node.value;
    }

    public void put(int key, int value) {
        Node existing = map.get(key);
        if (existing == null) {
            Node node = new Node(key, value);
            map.put(key, node);
            if (head == null) {
                head = node;
            }
            if (tail == null) {
                tail = node;
            } else {
                tail.next = node;
                node.previous = tail;
                tail = node;
            }
            if (map.size() > capacity) {
                evict();
            }
        } else {
            existing.value = value;
            markUsed(existing);
        }
    }

    private void markUsed(Node node) {
        if (node == tail) {
            return;
        }
        // remove from current position
        if (node == head) {
            head = node.next;
            head.previous = null;
        } else {
            node.previous.next = node.next;
            node.next.previous = node.previous;
        }
        // add to tail
        tail.next = node;
        node.previous = tail;
        node.next = null;
        tail = node;
    }

    private void evict() {
        map.remove(head.key);
        head = head.next;
    }

    private static class Node {
        int key;
        int value;
        Node previous;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
