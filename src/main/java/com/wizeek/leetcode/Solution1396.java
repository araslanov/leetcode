package com.wizeek.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution1396 {
    private final Map<Integer, CheckIn> checkIns = new HashMap<>();
    private final Map<String, Map<String, Average>> averageMap = new HashMap<>();

    public Solution1396() {
    }

    public void checkIn(int id, String stationName, int t) {
        checkIns.put(id, new CheckIn(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        CheckIn checkIn = checkIns.get(id);
        Map<String, Average> averages = averageMap.computeIfAbsent(checkIn.station, key -> new HashMap<>());
        Average average = averages.computeIfAbsent(stationName, key -> new Average(0, 0));
        int time = t - checkIn.time;
        average.average = (average.average * average.n + time) / (average.n + 1);
        average.n += 1;
    }

    public double getAverageTime(String startStation, String endStation) {
        return averageMap.get(startStation).get(endStation).average;
    }

    private static class CheckIn {
        String station;
        int time;

        CheckIn(String station, int time) {
            this.station = station;
            this.time = time;
        }
    }

    private static class Average {
        double average;
        int n;

        Average(double average, int n) {
            this.average = average;
            this.n = n;
        }
    }
}
