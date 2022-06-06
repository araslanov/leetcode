package com.wizeek.leetcode;

public class Solution705_2 {
    private final boolean[] lol = new boolean[1000001];

    public Solution705_2() {
    }

    public void add(int key) {
        lol[key] = true;
    }

    public void remove(int key) {
        lol[key] = false;
    }

    public boolean contains(int key) {
        return lol[key];
    }
}
