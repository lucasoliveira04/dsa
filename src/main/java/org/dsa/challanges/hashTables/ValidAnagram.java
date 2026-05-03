package org.dsa.challanges.hashTables;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";

        Map<Character,Integer> mapS1 = new HashMap<>();
        Map<Character,Integer> mapS2 = new HashMap<>();

        if (s.length() != t.length()) System.out.println("Not is anagram");


        for (int i = 0; i < s.length(); i++) {
            if (mapS1.containsKey(s.charAt(i))) {
                mapS1.put(s.charAt(i),mapS1.get(s.charAt(i))+1);
            } else  {
                mapS1.put(s.charAt(i),1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (mapS2.containsKey(t.charAt(i))) {
                mapS2.put(t.charAt(i),mapS2.get(t.charAt(i))+1);
            } else   {
                mapS2.put(t.charAt(i),1);
            }
        }

        if (mapS1.size() != mapS2.size()) System.out.println("Not is anagram");

        for (Map.Entry<Character,Integer> entry : mapS1.entrySet()) {
            if (!entry.getValue().equals(mapS2.get(entry.getKey()))) {
                return false;
            }
        }

        if (mapS1.size() == mapS2.size()) System.out.println("Is anagram");
    }
}
