package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int number;

        for (int i = 1; i <= N; i++){
            number = sc.nextInt();

            if (number > 0 && number % 2 == 0) {
                System.out.println("EVEN POSITIVE");
            } else if (number < 0 && number % 2 == 0) {
                System.out.println("EVEN NEGATIVE");
            } else if (number > 0 && number % 2 != 0) {
                System.out.println("ODD POSITIVE");
            } else if (number < 0 && number % 2 != 0) {
                System.out.println("ODD NEGATIVE");
            } else {
                System.out.println("NULL");
            }
        }
;
    }
}
