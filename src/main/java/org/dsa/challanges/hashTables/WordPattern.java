package org.dsa.challanges.hashTables;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        String conj = "aaa";
        String fraseCerta = "aa aa aa aa";
        System.out.println(wordPattern(conj, fraseCerta));
    }

    public static boolean wordPattern(String pattern, String s) {
        Map<String, String> map = new HashMap<>();
        String[] words = s.split(" ");

        if (pattern.length() != words.length) return false;

        for (int i = 0; i < pattern.length(); i++) {
            String letra = String.valueOf(pattern.charAt(i));

            if (!map.containsKey(letra)){
                if (map.containsValue(words[i])) return false;
                map.put(letra, words[i]);
            }

            if (!map.get(letra).equals(words[i])) return false;
        }

        return true;
    }
}
