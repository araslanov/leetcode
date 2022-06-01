package com.wizeek.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class Solution1249_2 {
    private Node head;
    private Node tail;

    public String minRemoveToMakeValid(String s) {
        Deque<Node> open = new LinkedList<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (!isParentheses(c)) {
                addNode(c);
                continue;
            }
            if (c == ')') {
                if (open.isEmpty()) {
                    continue;
                }
                open.pollLast();
                addNode(c);
            } else {
                Node node = addNode(c);
                open.offerLast(node);
            }
        }
        while (!open.isEmpty()) {
            Node node = open.pollFirst();
            deleteNode(node);
        }
        StringBuilder result = new StringBuilder();
        while (head != null) {
            result.append(head.value);
            head = head.next;
        }
        return result.toString();
    }

    private void deleteNode(Node node) {
        if (node == head) {
            head = node.next;
            if (head != null) {
                head.previous = null;
            }
            return;
        }
        if (node == tail) {
            tail = tail.previous;
            tail.next = null;
            return;
        }
        node.previous.next = node.next;
        node.next.previous = node.previous;
    }

    private Node addNode(char c) {
        if (head == null) {
            head = new Node(c);
            tail = head;
            return head;
        }
        tail.next = new Node(c);
        tail.next.previous = tail;
        tail = tail.next;
        return tail;
    }

    private boolean isParentheses(char c) {
        return c == '(' || c == ')';
    }

    private static class Node {
        char value;
        Node previous;
        Node next;

        Node(char value) {
            this.value = value;
        }
    }
}
