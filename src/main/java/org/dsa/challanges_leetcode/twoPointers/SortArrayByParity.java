package org.dsa.challanges_leetcode.twoPointers;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] a = {3,1,2,4};
        arrayByParity(a);

        for  (int num : a) {
            System.out.print(num + " ");
        }
    }

    private static int[] arrayByParity(int[] a) {
        int left = 0;
        int right = a.length - 1;

        while (left < right) {
            if (a[left] % 2 == 0) {
                left++;
            } else if (a[right] % 2 != 0) {
                right--;
            } else  {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
            }
        }
        return a;
    }
}
