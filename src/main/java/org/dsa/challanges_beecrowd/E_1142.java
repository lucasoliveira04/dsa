package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_1142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 1;
        for (int i = 1; i <= N; i++){
            System.out.printf("%d %d %d PUM\n", count, count+1, count+2);
            count+=4;
        }
    }
}
