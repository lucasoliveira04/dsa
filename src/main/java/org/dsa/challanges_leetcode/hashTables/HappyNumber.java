package org.dsa.challanges_leetcode.hashTables;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        int happyNumber = 82;
        System.out.println(isHappy(happyNumber));
    }

    private static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while (n != 1) {
            if (set.contains(n)) {
                return false;
            }

            set.add(n);
            n = calc(n);
        }

        return true;
    }
    private static int calc(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
