package org.dsa.challanges.Strings;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
    public static void main(String[] args) {
        String s = "ab";
        String t = "aa";


        Map<Character, Character> map = new HashMap<>();
        map.put(s.charAt(0), s.charAt(1));

        if (isIsomorphic(s, t)) {
            System.out.println("The strings are isomorphic.");
        } else {
            System.out.println("The strings are not isomorphic.");
        }
    }

    private static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            if (map.containsKey(cs)) {
                if (map.get(cs) != ct) return false;
            } else {
                if (map2.containsKey(ct)) return false;
                map.put(cs, ct);
                map2.put(ct, cs);
            }
        }

        return true;
    }

}
