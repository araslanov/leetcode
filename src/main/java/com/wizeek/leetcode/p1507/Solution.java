package com.wizeek.leetcode.p1507;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private static final Map<String, String> MONTH_MAP = new HashMap<>();

    static {
        MONTH_MAP.put("Jan", "01");
        MONTH_MAP.put("Feb", "02");
        MONTH_MAP.put("Mar", "03");
        MONTH_MAP.put("Apr", "04");
        MONTH_MAP.put("May", "05");
        MONTH_MAP.put("Jun", "06");
        MONTH_MAP.put("Jul", "07");
        MONTH_MAP.put("Aug", "08");
        MONTH_MAP.put("Sep", "09");
        MONTH_MAP.put("Oct", "10");
        MONTH_MAP.put("Nov", "11");
        MONTH_MAP.put("Dec", "12");
    }

    public String reformatDate(String date) {
        String[] parts = date.split(" ");
        StringBuilder result = new StringBuilder();
        result.append(parts[2]);
        result.append("-");
        result.append(MONTH_MAP.get(parts[1]));
        result.append("-");
        String day = parts[0].split("[snrt]")[0];
        if (day.length() < 2) {
            result.append("0");
        }
        result.append(day);
        return result.toString();
    }
}
