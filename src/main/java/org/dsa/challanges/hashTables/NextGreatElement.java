package org.dsa.challanges.hashTables;

public class NextGreatElement {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] result = nextGreaterElement(nums1, nums2);
        for (int i : result) {
            System.out.println(i);
        }
    }

    static int[] nextGreaterElement(int[] nums1,  int[] nums2) {
        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int value = nums1[i];
            int nextGreater = -1;
            boolean found = false;

            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == value) {
                    found = true;
                    continue;
                }

                if (found && nums2[j] > value) {
                    nextGreater = nums2[j];
                    break;
                }
            }

            result[i] = nextGreater;
        }

        return result;
    }
}