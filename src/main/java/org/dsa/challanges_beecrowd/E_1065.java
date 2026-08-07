package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, par = 0;

        for (int i = 1; i <= 5; i++){
            number = sc.nextInt();
            if (number % 2 == 0){
                par++;
            }
        }

        System.out.println(par + " valores pares");
    }
}
