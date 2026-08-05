package org.dsa.challanges_leetcode.Strings;

public class LicenseKeyFormatting {

    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("5F3Z-2e-9-w", 4));
    }

    static String licenseKeyFormatting(String S, int K) {
        StringBuilder sb = new StringBuilder();
        int groupSize = 0;

        for (int i = 0; i < S.length(); i++) {
            char atualChar = S.charAt(i);

            if (atualChar == '-') continue;

            if (groupSize == K) {
                sb.append('-');
                groupSize = 0;
            }

            sb.append(Character.toUpperCase(atualChar));
            groupSize++;
        }

        return sb.reverse().toString();
    }

}
