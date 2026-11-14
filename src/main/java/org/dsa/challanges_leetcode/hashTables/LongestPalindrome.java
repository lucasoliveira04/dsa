package org.dsa.challanges_leetcode.hashTables;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static void main(String[] args) {
        String str = "aab";
        System.out.println(longestPalindrome(str));
    }

    public static int longestPalindrome(String s) {
        Map<Character, Integer> frequencia = new HashMap<>();

        for (char c : s.toCharArray()) {
            frequencia.put(c, frequencia.getOrDefault(c, 0) + 1);
        }

        int result = 0;
        boolean temOdd = false;

        for (int count : frequencia.values()) {
            result += (count / 2) * 2;

            if (count % 2 != 0) {
                temOdd = true;
            }
        }

        if (temOdd) {
            return result + 1;
        }

        return result;
    }
}
