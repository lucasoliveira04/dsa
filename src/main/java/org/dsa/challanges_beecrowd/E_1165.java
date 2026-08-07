package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_1165 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            boolean isPrimo = true;

            if (x < 2) {
                isPrimo = false;
            } else {
                for (int j = 2; j * j <= x; j++) {
                    if (x % j == 0) {
                        isPrimo = false;
                        break;
                    }
                }
            }

            if (isPrimo) {
                System.out.println(x + " eh primo");
            } else {
                System.out.println(x + " nao eh primo");
            }
        }
    }
}

