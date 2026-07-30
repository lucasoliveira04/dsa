package org.dsa.challanges_leetcode.Strings;

public class ToHex {
    public static void main(String[] args) {
        int num = 26;
        System.out.println(toHex(num));
    }

    static String toHex(int num) {
        if (num == 0) {
            return "0";
        }

        String digits = "0123456789abcdef";
        StringBuilder result = new StringBuilder();

        if (num > 0) {
            while (num > 0) {
                int remainder = num % 16;
                result.append(digits.charAt(remainder));
                num /= 16;
            }
        } else {
            long value = -(long) num;
            int carry = 1;

            for (int i = 0; i < 8; i++) {
                int originalDigit = (int) (value % 16);

                int convertedDigit = 15 - originalDigit + carry;

                result.append(digits.charAt(convertedDigit % 16));
                carry = convertedDigit / 16;

                value /= 16;
            }
        }

        return result.reverse().toString();
    }
}
