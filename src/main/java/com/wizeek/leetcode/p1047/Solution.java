package com.wizeek.leetcode.p1047;

public class Solution {
    public String removeDuplicates(String s) {
        if (s.length() < 2) {
            return s;
        }
        Node head = new Node();
        head.value = 0;
        Node tail = head;
        for (int i = 1; i < s.length(); i++) {
            Node node = new Node();
            node.value = i;
            node.previous = tail;
            tail.next = node;
            tail = node;
        }
        Node current = head;
        while (current != null && current.next != null) {
            Node next = current.next;
            if (s.charAt(current.value) == s.charAt(next.value)) {
                if (current.previous == null) {
                    current = next.next;
                    if (current != null) {
                        current.previous = null;
                    }
                    head = current;
                } else {
                    current.previous.next = next.next;
                    current = current.previous;
                    if (next.next != null) {
                        next.next.previous = current;
                    }
                }
            } else {
                current = next;
            }
        }
        current = head;
        StringBuilder result = new StringBuilder();
        while (current != null) {
            result.append(s.charAt(current.value));
            current = current.next;
        }
        return result.toString();
    }

    private static class Node {
        int value;
        Node previous;
        Node next;
    }
}
