package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        number = sc.nextInt();

        for (int i = 1; i <= number; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
