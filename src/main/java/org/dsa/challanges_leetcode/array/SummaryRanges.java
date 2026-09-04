package org.dsa.challanges_leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < nums.length) {
            int inicio = nums[i];

            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
                i++;
            }

            int fim = nums[i];

            if (inicio == fim) {
                result.add(String.valueOf(inicio));
            } else {
                result.add(inicio + "->" + fim);
            }

            i++;
        }

        return result;
    }
}
