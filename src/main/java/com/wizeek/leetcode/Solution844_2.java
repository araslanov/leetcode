package com.wizeek.leetcode;

public class Solution844_2 {
    public boolean backspaceCompare(String s, String t) {
        int sn = s.length();
        int tn = t.length();
        int si = sn - 1;
        int ti = tn - 1;
        int sSkip = 0;
        int tSkip = 0;
        while (si >= 0 || ti >= 0) {
            if (si >= 0 && s.charAt(si) == '#') {
                sSkip++;
                si--;
                continue;
            }
            if (ti >= 0 && t.charAt(ti) == '#') {
                tSkip++;
                ti--;
                continue;
            }
            if (sSkip > 0) {
                si--;
                sSkip--;
                continue;
            }
            if (tSkip > 0) {
                ti--;
                tSkip--;
                continue;
            }
            if (si >= 0 && ti >= 0) {
                if (s.charAt(si) == t.charAt(ti)) {
                    si--;
                    ti--;
                    continue;
                } else {
                    return false;
                }
            }
            return false;
        }
        return true;
    }
}
