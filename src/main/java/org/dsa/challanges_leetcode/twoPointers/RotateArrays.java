package org.dsa.challanges_leetcode.twoPointers;

public class RotateArrays {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        k = k % nums.length;

        int left = 0;
        int tempK = k;

        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

        start = 0;
        end = k - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

        start = k;
        end = nums.length - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
