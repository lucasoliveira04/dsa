package org.dsa.challanges_leetcode.twoPointers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DistinctAverages {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);

        Set<Double> medias = new HashSet<Double>();

        int esq = 0;
        int right = nums.length - 1;

        while (esq < right) {
            double avg = (nums[esq] + nums[right]) / 2.0;

            medias.add(avg);
            esq++;
            right--;
        }

        return medias.size();
    }

    public static void main(String[] args) {
        DistinctAverages d = new DistinctAverages();
        System.out.println("Media de maior e menor: " + d.distinctAverages(new int[]{10,2,2,0,4,0}));
    }
}
