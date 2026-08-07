package org.dsa.challanges_leetcode.hashTables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class letter {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) return result;
        
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");  

        recur(result, new StringBuilder(), digits, 0, map);
        return result;
    }

    private void recur(List<String> result, StringBuilder current, String digits, int index, Map<Character, String> map) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letras = map.get(digits.charAt(index));
        for (char c : letras.toCharArray()) {
            current.append(c);
            recur(result, current, digits, index + 1, map);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
