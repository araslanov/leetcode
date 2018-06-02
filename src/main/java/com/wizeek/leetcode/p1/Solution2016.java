package com.wizeek.leetcode.p1;

import java.util.Arrays;

/**
 * Created by Artur on 6/2/2018.
 */
public class Solution2016 {
    private int[] array;
    private int L;
    private int sum;
    private int[] sortedArray;

    public int[] twoSum(int[] nums, int target) {
        init(nums, target);
        int a;
        int b;
        for (int i = 0; i < L; i++) {
            a = sortedArray[i];
            b = recursionB(a, i + 1, L-1);
            if (a + b == sum) {
                return buildResult(a, b);
            }
        }
        return new int[]{0, 0};
    }

    private int[] recursionA(int aIndexStart, int aIndexEnd) {
        if (aIndexEnd < aIndexStart) {
            aIndexStart = 0;
        }
        int aIndex = (aIndexEnd + aIndexStart) / 2;
        //System.out.println("aIndex = " + aIndexStart + "-" + aIndexEnd + ", " + aIndex);
        int a = sortedArray[aIndex];
        int b = recursionB(a, aIndex + 1, L-1);

        if (a + b == sum) {
            return buildResult(a, b);
        } else if (a + b < sum) {
            return recursionA(aIndex + 1, aIndexEnd);
        } else if (a + b > sum) {
            return recursionA(aIndexStart, aIndex - 1);
        }
        return new int[]{0, 0};
    }

    private int recursionB(int a, int bIndexStart, int bIndexEnd) {
        if (bIndexEnd < bIndexStart) {
            bIndexEnd = bIndexStart;
        }
        int bIndex = (bIndexEnd + bIndexStart) / 2;
        //System.out.println("\tbIndex = " + bIndexStart + "-" + bIndexEnd + ", " + bIndex);
        int b = sortedArray[bIndex];

        if (a + b == sum || bIndexStart == bIndexEnd) {
            //System.out.println("\t" + a + " + " + b + " = " + (a + b) + " = " + sum);
            return b;
        } else if (a + b < sum) {
            //System.out.println("\t" + a + " + " + b + " = " + (a + b) + " < " + sum);
            return recursionB(a, bIndex + 1, bIndexEnd);
        } else if (a + b > sum) {
            //System.out.println("\t" + a + " + " + b + " = " + (a + b) + " > " + sum);
            return recursionB(a, bIndexStart, bIndex - 1);
        }
        return 0;
    }

    private void init(int[] array, int sum) {
        this.array = array;
        this.L = array.length;
        this.sum = sum;
        this.sortedArray = new int[L];
        System.arraycopy(array, 0, sortedArray, 0, L);
        Arrays.sort(sortedArray);
    }

    private int[] buildResult(int a, int b) {
        int[] result = new int[2];
        int j = 0;
        for (int i = 0; i < L; i++) {
            if (a == array[i] || b == array[i]) {
                result[j++] = i;
                if (j > 1) {
                    return result;
                }
            }
        }
        return result;
    }
}
