package com.wizeek.leetcode;

import java.math.BigInteger;

public class Solution67 {
    public String addBinary(String a, String b) {
        BigInteger aInt = new BigInteger(a, 2);
        BigInteger bInt = new BigInteger(b, 2);
        BigInteger zero = new BigInteger("0", 2);
        BigInteger sum;
        BigInteger carry;
        while (!bInt.equals(zero)) {
            sum = aInt.xor(bInt);
            carry = aInt.and(bInt).shiftLeft(1);
            aInt = sum;
            bInt = carry;
        }
        return aInt.toString(2);
    }
}
