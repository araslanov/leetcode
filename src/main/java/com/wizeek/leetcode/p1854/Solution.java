package com.wizeek.leetcode.p1854;

import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public int maximumPopulation(int[][] logs) {
        Map<Integer, Integer> populationByYear = new TreeMap<>();
        int maxPop = 0;
        int firstYearOfMaxPop = 0;
        for (int[] log : logs) {
            for (int year = log[0]; year < log[1]; year++) {
                populationByYear.merge(year, 1, Integer::sum);
                int pop = populationByYear.get(year);
                if (maxPop < pop) {
                    firstYearOfMaxPop = year;
                    maxPop = pop;
                } else if (maxPop == pop && firstYearOfMaxPop > year) {
                    firstYearOfMaxPop = year;
                }
            }
        }
        return firstYearOfMaxPop;
    }
}
