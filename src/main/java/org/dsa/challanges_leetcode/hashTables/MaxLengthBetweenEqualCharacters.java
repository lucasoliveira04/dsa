package org.dsa.challanges_leetcode.hashTables;

public class MaxLengthBetweenEqualCharacters {
    public int maxLengthBetweenEqualCharacters(String s) {
        int result = -1;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    result = Math.max(result, j - i - 1);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "cbzxy";
        MaxLengthBetweenEqualCharacters maxLengthBetweenEqualCharacters = new MaxLengthBetweenEqualCharacters();
        System.out.println(maxLengthBetweenEqualCharacters.maxLengthBetweenEqualCharacters(s));
    }
}
