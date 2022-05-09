package com.wizeek.leetcode.p605;

public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int maxNewPlants = 0;
        int i = 0;
        while (i < flowerbed.length) {
            if (flowerbed[i] == 1) {
                i += 2;
                continue;
            }
            if ((i - 1 < 0 || flowerbed[i - 1] == 0) && (i + 1 >= flowerbed.length || flowerbed[i + 1] == 0)) {
                maxNewPlants++;
                if (maxNewPlants == n) {
                    return true;
                }
                i += 2;
            } else {
                i++;
            }
        }
        return n <= maxNewPlants;
    }
}
