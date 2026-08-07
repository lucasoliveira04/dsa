package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_1153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, fat;

        n = sc.nextInt();
        fat = 1;

        for (int i = 1; i <= n; i++) {
            fat *= i;
        }
        System.out.println(fat);
    }
}
