package org.dsa.challanges.Strings;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        firstUniqueChar("Bananaa");
    }

    private static int firstUniqueChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), 2);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
