package org.dsa.challanges_hackerrank;

import java.util.List;

public class FindSmallestMissingPositive {
    public static int findSmallestMissingPositive(List<Integer> orderNumbers) {
        int number = orderNumbers.size();

        for (int i = 0; i < number; i++) {
            while (orderNumbers.get(i) > 0 && orderNumbers.get(i) <= number &&
                    !orderNumbers.get(i).equals(orderNumbers.get(orderNumbers.get(i) - 1))) {
                int value = orderNumbers.get(i);
                int correctIndex = value - 1;

                int temp = orderNumbers.get(correctIndex);

                orderNumbers.set(correctIndex, value);
                orderNumbers.set(i, temp);
            }
        }

        for (int i = 0; i < number; i++) {
            if (orderNumbers.get(i) != i + 1) {
                return i + 1;
            }
        }

        return number + 1;
    }
}
