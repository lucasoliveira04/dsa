package org.dsa.challanges_leetcode.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates2 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                set.remove(nums[i-k-1]);
            }

            if (set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
