package org.dsa.challanges_leetcode.twoPointers;

import java.util.LinkedHashMap;
import java.util.Map;

public class LimitOccurrencesInSortedArray {

    public int[] limitOccurrences(int[] nums, int k) {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        int reps = 0;

        while (reps < nums.length) {
            if (map.containsKey(nums[reps])) {
                if (map.get(nums[reps]) < k) {
                    map.put(nums[reps], map.get(nums[reps]) + 1);
                }
            } else if (k > 0) {
                map.put(nums[reps], 1);
            }

            reps++;
        }

        int tamanho = 0;
        for (int ocorrencias : map.values()) {
            tamanho += ocorrencias;
        }

        int[] result = new int[tamanho];
        int inc = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int chave =  entry.getKey();

            int insercoes = entry.getValue();

            while (insercoes-- > 0) {
                result[inc] = chave;
                inc++;
            }
        }


        return result;
    }

    public static void main(String[] args) {
        LimitOccurrencesInSortedArray l = new LimitOccurrencesInSortedArray();
        int[] a = l.limitOccurrences(new int[]{1,2, 1, 1, 1, 1,3,4,5,6,7,8,9}, 3);

        for (int n : a) {
            System.out.print(n + " ");
        }
    }
}
