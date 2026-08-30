package org.dsa.challanges_hackerrank;

import java.util.List;

public class CountResponseTimeRegressions {
    public static int countResponseTimeRegressions(List<Integer> responseTimes) {
        int result = 0;
        long sum = 0;

        for (int i = 0; i < responseTimes.size(); i++) {
            if (i > 0) {
                long current = responseTimes.get(i);

                if (current * i > sum) {
                    result++;
                }
            }

            sum += responseTimes.get(i);
        }

        return result++;

    }
}
