package com.wizeek.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution12 {
    private static final Map<Integer, Character> I2R = new HashMap<>();

    static {
        I2R.put(1000, 'M');
        I2R.put(500, 'D');
        I2R.put(100, 'C');
        I2R.put(50, 'L');
        I2R.put(10, 'X');
        I2R.put(5, 'V');
        I2R.put(1, 'I');
    }

    public String intToRoman(int n) {
        StringBuilder sb = new StringBuilder();
        int base = 1000;
        while (n > 0) {
            int div = n / base;
            if (div < 4) {
                for (int i = 0; i < div; i++) {
                    sb.append(I2R.get(base));
                }
            } else if (div == 4) {
                sb.append(I2R.get(base));
                sb.append(I2R.get(5 * base));
            } else if (div == 5) {
                sb.append(I2R.get(5 * base));
            } else if (div == 9) {
                sb.append(I2R.get(base));
                sb.append(I2R.get(10 * base));
            } else {
                sb.append(I2R.get(5 * base));
                for (int i = 0; i < div - 5; i++) {
                    sb.append(I2R.get(base));
                }
            }
            n -= div * base;
            base /= 10;
        }
        return sb.toString();
    }
}
