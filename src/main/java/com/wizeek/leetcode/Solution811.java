package com.wizeek.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution811 {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for (String cpdomain : cpdomains) {
            String[] split = cpdomain.split(" ");
            Integer count = Integer.valueOf(split[0]);
            String domain = split[1];
            addToMap(map, domain, count);
        }
        List<String> result = new LinkedList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result.add("" + entry.getValue() + " " + entry.getKey());
        }
        return result;
    }

    private void addToMap(Map<String, Integer> map, String domain, Integer count) {
        String[] subs = domain.split("\\.");
        int n = subs.length;
        String base = "";
        for (int i = n - 1; i >= 0; i--) {
            String url = subs[i] + base;
            map.put(url, map.getOrDefault(url, 0) + count);
            base = "." + url;
        }
    }
}
