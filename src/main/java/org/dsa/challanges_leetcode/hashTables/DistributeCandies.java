package org.dsa.challanges_leetcode.hashTables;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        Set<Integer> tipos = new HashSet<>();

        for (int candy : candyType) {
            tipos.add(candy);
        }

        int maxCandies = candyType.length / 2;

        return Math.min(tipos.size(), maxCandies);
    }
}
