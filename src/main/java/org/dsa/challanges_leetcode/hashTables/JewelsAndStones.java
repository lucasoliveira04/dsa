package org.dsa.challanges_leetcode.hashTables;

import java.util.HashMap;
import java.util.Map;

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Character> mapJoias = new HashMap<>();

        for (char c : jewels.toCharArray()) {
            mapJoias.put(c, c);
        }

        long joias = 0;

        for (int i = 0; i < stones.length(); i++) {
            char minhaJoia = stones.charAt(i);
            if (mapJoias.containsKey(minhaJoia)) {
                joias++;
            }
        }

        return (int)joias;
    }

    public static void main(String[] args) {
        JewelsAndStones j = new JewelsAndStones();
        int joias = j.numJewelsInStones("A", "aAAbbbb");
        System.out.println(joias);
    }
}
