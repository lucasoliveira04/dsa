package org.dsa.challanges.Strings;

import java.util.concurrent.atomic.AtomicInteger;

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

        AtomicInteger i = new  AtomicInteger(0);

        t.chars().forEach(j -> {
            if (i.get() < s.length() && j == s.charAt(i.get())) {
                i.incrementAndGet();
            }
        });

        return i.get() == s.length();

    }
}
