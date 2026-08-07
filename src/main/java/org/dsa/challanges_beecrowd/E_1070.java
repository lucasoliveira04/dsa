package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number % 2 == 0){
            number++;
        }

        for (int i = 1; i <= 6; i++){
            System.out.println(number);
            number+=2;
        }
    }
}
