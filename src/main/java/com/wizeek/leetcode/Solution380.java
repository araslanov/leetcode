package com.wizeek.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution380 {
    private final Map<Integer, Integer> valueToIndex = new HashMap<>();
    private final List<Integer> indexToValue = new ArrayList<>();

    public Solution380() {
    }

    public boolean insert(int val) {
        if (valueToIndex.containsKey(val)) {
            return false;
        }
        valueToIndex.put(val, valueToIndex.size());
        indexToValue.add(val);
        return true;
    }

    public boolean remove(int val) {
        Integer index = valueToIndex.remove(val);
        if (index == null) {
            return false;
        }
        int lastIndex = indexToValue.size() - 1;
        int lastValue = indexToValue.get(lastIndex);
        indexToValue.set(index, lastValue);
        indexToValue.remove(lastIndex);
        if (lastValue != val) {
            valueToIndex.put(lastValue, index);
        }
        return true;
    }

    public int getRandom() {
        int index = (int) (valueToIndex.size() * Math.random());
        return indexToValue.get(index);
    }
}
