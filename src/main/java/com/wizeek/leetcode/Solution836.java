package com.wizeek.leetcode;

public class Solution836 {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        boolean top = rec2[1] >= rec1[3];
        boolean right = rec2[0] >= rec1[2];
        boolean bottom = rec2[3] <= rec1[1];
        boolean left = rec2[2] <= rec1[0];
        return !(top || right || bottom || left);
    }
}
