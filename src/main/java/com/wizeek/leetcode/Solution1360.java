package com.wizeek.leetcode;

public class Solution1360 {
    private static final int[] DAYS_IN_MONTH_ACCUMULATING = new int[]{0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};

    public int daysBetweenDates(String date1, String date2) {
        int days1 = getDays(date1);
        int days2 = getDays(date2);
        return Math.abs(days1 - days2);
    }

    private static int getDays(String date) {
        int[] ymd = parseDate(date);
        int days = 0;
        days += (ymd[0] - 1971) * 365;
        days += (ymd[0] - 1 - 1968) / 4;
        days += DAYS_IN_MONTH_ACCUMULATING[ymd[1] - 1];
        if (isLeapYear(ymd[0]) && ymd[1] > 2) {
            days++;
        }
        days += ymd[2] - 1;
        return days;
    }

    private static int[] parseDate(String date) {
        String[] parts = date.split("-");
        int[] result = new int[3];
        result[0] = Integer.parseInt(parts[0]);
        result[1] = Integer.parseInt(parts[1]);
        result[2] = Integer.parseInt(parts[2]);
        return result;
    }

    private static boolean isLeapYear(int year) {
        if (year % 100 == 0 && year % 400 != 0) {
            return false;
        }
        return (year - 1968) % 4 == 0;
    }
}
