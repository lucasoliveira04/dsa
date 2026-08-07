package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_1143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int value1 = 0, value2 = 1;
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            value1 = i;
            value2 = value1 * i;
            System.out.printf("%d %d %d\n", i, value1*i, value2*i);
        }
    }
}
