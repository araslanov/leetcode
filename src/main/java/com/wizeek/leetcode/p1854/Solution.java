package com.wizeek.leetcode.p1854;

public class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] populationByYear = new int[101];
        int maxPop = 0;
        int firstYearOfMaxPop = 0;
        for (int[] log : logs) {
            for (int year = log[0]; year < log[1]; year++) {
                int pop = ++populationByYear[year - 1950];
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
