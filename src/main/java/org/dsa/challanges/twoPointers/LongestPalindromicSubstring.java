package org.dsa.challanges.twoPointers;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String pal = "cbbd";

        int left = 0;

        String longest = "";

        while (left < pal.length()) {
            String par = expand(pal, left, left);
            String impar = expand(pal, left, left+1);

            if (par.length() > longest.length()) longest = par;
            if (impar.length() > longest.length()) longest = impar;

            left++;
        }

        System.out.println(longest);
    }

    static String expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return s.substring(left + 1, right);
    }

}
