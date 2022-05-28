package com.wizeek.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution359 {
    private final Map<String, Integer> map = new HashMap<>();

    public Solution359() {
    }

    public boolean shouldPrintMessage(int timestamp, String message) {
        Integer previousTimestamp = map.get(message);
        if (previousTimestamp == null) {
            map.put(message, timestamp);
            return true;
        }
        if (timestamp >= previousTimestamp + 10) {
            map.put(message, timestamp);
            return true;
        }
        return false;
    }
}
