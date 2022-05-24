package com.wizeek.leetcode;

public class Solution706 {
    private final Node[] array;

    public Solution706() {
        this(16);
    }

    public Solution706(int capacity) {
        array = new Node[capacity];
    }

    public void put(int key, int value) {
        int i = key % array.length;
        Node existing = array[i];
        if (existing == null) {
            array[i] = new Node(key, value);
        } else {
            Node current = existing;
            while (current != null) {
                if (current.key == key) {
                    current.value = value;
                    return;
                }
                current = current.next;
            }
            Node newNode = new Node(key, value);
            newNode.next = existing;
            array[i] = newNode;
        }
    }

    public int get(int key) {
        int i = key % array.length;
        Node existing = array[i];
        if (existing == null) {
            return -1;
        }
        while (existing != null) {
            if (existing.key == key) {
                return existing.value;
            }
            existing = existing.next;
        }
        return -1;
    }

    public void remove(int key) {
        int i = key % array.length;
        Node existing = array[i];
        if (existing == null) {
            return;
        }
        Node previous = null;
        while (existing != null) {
            if (existing.key == key) {
                if (previous == null) {
                    array[i] = existing.next;
                } else {
                    previous.next = existing.next;
                }
                return;
            }
            previous = existing;
            existing = existing.next;
        }
    }

    private static class Node {
        int key;
        int value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
