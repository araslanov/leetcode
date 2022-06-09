package com.wizeek.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Solution314 {
    public List<List<Integer>> verticalOrder(TreeNode root) {
        Map<Integer, Map<Integer, List<Integer>>> map = new TreeMap<>();
        addToMap(map, root, 0, 0);
        List<List<Integer>> result = new LinkedList<>();
        for (Map<Integer, List<Integer>> subMap : map.values()) {
            List<Integer> list = new LinkedList<>();
            for (List<Integer> subList : subMap.values()) {
                list.addAll(subList);
            }
            result.add(list);
        }
        return result;
    }

    private void addToMap(Map<Integer, Map<Integer, List<Integer>>> map, TreeNode root, int depth, int shift) {
        if (root == null) {
            return;
        }
        map.computeIfAbsent(shift, key -> new TreeMap<>()).computeIfAbsent(depth, key -> new LinkedList<>()).add(
                root.val);
        addToMap(map, root.left, depth + 1, shift - 1);
        addToMap(map, root.right, depth + 1, shift + 1);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
