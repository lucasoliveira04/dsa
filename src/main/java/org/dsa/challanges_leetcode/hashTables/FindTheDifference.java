package org.dsa.challanges_leetcode.hashTables;

import java.util.HashSet;
import java.util.Set;

public class FindTheDifference {
    public static void main(String[] args) {
        String a = "a";
        String b = "aa";
        System.out.println(findTheDifference(a,b));
    }

    static char findTheDifference(String s, String t) {
        Set<Character> set = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (!set.add(c)) {
                set.remove(c);
            }
        }

        for (char c : t.toCharArray()) {
            if (!set.add(c)) {
                set.remove(c);
            }
        }

        return set.iterator().next();
    }
}
