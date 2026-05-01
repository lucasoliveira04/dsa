package org.dsa.challanges.twoPointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 9, 3, 7, 12, 8, 3, 4, 12, 7};
        int curr = 12;

        int[] twoSumResult = twoSum(nums, curr);

        if (twoSumResult == null) {
            System.out.println("No two sum solution");
            return;
        }

        System.out.println("two sum found: " + Arrays.toString(twoSumResult));
        System.out.println("two sum values: " + nums[twoSumResult[0]] + " " + nums[twoSumResult[1]]);
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complements = target - nums[i];

            if (map.containsKey(complements)) {
                return new int[]{map.get(complements), i};
            }

            map.put(nums[i], i);
        }

        return null;
    }
}
