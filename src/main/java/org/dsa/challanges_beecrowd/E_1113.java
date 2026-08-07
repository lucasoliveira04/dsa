package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_1113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;

        while (true){
            x = sc.nextInt();
            y = sc.nextInt();

            if (x == y){
                break;
            }

            if (x > y) {
                System.out.println("Decrescente");
            } else {
                System.out.println("Crescente");
            }
        }
    }
}
