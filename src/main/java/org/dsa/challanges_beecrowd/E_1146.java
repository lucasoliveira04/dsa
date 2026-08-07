package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_1146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        x = sc.nextInt();
        while (x != 0) {
            for (int i = 1; i <= x; i++) {
                if (i == x){
                    System.out.print(i + "\n");
                } else {
                    System.out.print(i + " ");
                }
            }
            x = sc.nextInt();
        }
    }
}
