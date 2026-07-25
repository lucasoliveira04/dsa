package org.dsa.challanges_leetcode.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 10, 4, 54, 3, 5, 10};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
