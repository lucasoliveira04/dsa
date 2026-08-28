package org.dsa.challanges_leetcode.array;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ThirdMax {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toCollection(TreeSet::new));

        for (int num : nums) {
            set.add(num);
        }

        if (set.size() < 3) {
            return set.last();
        }

        set.pollLast();
        set.pollLast();

        return set.last();
    }

    public static void main(String[] args) {

    }
}
