package org.dsa.challanges_leetcode.Strings;

import java.util.HashMap;
import java.util.Map;

public class AddStrings {
    public static void main(String[] args) {
        String n1 = "11";
        String n2 = "321";
        System.out.println(addStrings(n1, n2));
    }

    static String addStrings(String num1, String num2) {
        Map<Character, Integer> digits = new HashMap<>();

        for (int value = 0; value <= 9; value++) {
            digits.put((char) ('0' + value), value);
        }

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = i >= 0 ? digits.get(num1.charAt(i)) : 0;
            int digit2 = j >= 0 ? digits.get(num2.charAt(j)) : 0;

            int sum = digit1 + digit2 + carry;

            result.append(sum % 10);
            carry = sum / 10;

            i--;
            j--;
        }

        return result.reverse().toString();
    }
}
