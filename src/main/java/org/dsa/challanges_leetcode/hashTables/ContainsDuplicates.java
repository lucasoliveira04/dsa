package org.dsa.challanges_leetcode.hashTables;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        if (containsDuplicate(nums)) {
            System.out.println("Duplicates found");
        }  else {
            System.out.println("No Duplicates found");
        }
    }

    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) return true;
        }

        return false;
    }
}
