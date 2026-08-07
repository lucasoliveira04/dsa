package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d\n", i, number, (i*number));
        }
    }
}
