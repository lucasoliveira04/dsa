package org.dsa.challanges.Strings;

public class IsSubsequence {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "axboc";

        if (isSubsequence(s1, s2)) {
            System.out.println("Is Subsequence");
        } else  {
            System.out.println("Is Not Subsequence");
        }
    }

    public static boolean isSubsequence(String s, String t) {

        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();
    }
}
