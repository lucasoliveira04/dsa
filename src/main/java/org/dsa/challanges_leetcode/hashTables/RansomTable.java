package org.dsa.challanges_leetcode.hashTables;

import java.util.HashMap;
import java.util.Map;

public class RansomTable {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        boolean canConstruct = canConstruct(ransomNote, magazine);
        System.out.println(canConstruct);
    }

    static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                return false;
            }

            map.put(c, map.get(c) - 1);
        }

        return true;
    }
}
