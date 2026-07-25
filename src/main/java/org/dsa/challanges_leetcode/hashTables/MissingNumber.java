package org.dsa.challanges_leetcode.hashTables;

import java.util.stream.IntStream;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int expectativaNumber = IntStream.rangeClosed(0, nums.length).sum();
        int currentlyNumber = IntStream.of(nums).sum();
        return expectativaNumber - currentlyNumber;
    }
}
