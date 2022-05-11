package com.wizeek.leetcode.p937;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Solution {
    public String[] reorderLogFiles(String[] logs) {
        String[] result = new String[logs.length];
        TreeMap<String, TreeSet<String>> contentToLog = new TreeMap<>();
        int j = result.length - 1;
        for (int i = logs.length - 1; i >= 0; i--) {
            String log = logs[i];
            if (isDigitLog(log)) {
                result[j--] = log;
            } else {
                String logContent = log.substring(log.indexOf(" ") + 1);
                TreeSet<String> newValue = contentToLog.getOrDefault(logContent, new TreeSet<>());
                newValue.add(log);
                contentToLog.put(logContent, newValue);
            }
        }
        j = 0;
        for (Map.Entry<String, TreeSet<String>> entry : contentToLog.entrySet()) {
            for (String log : entry.getValue()) {
                result[j++] = log;
            }
        }
        return result;
    }

    private static boolean isDigitLog(String log) {
        return log.charAt(log.length() - 1) >= '0' && log.charAt(log.length() - 1) <= '9';
    }
}
