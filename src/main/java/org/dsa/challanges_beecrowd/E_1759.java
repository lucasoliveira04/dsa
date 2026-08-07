package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_1759 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 0 && n <= 1000000){
            for (int i = 1; i < n; i++){
                System.out.print("Ho" + " ");
            }
            System.out.println("Ho" + "!");
        }

    }
}
