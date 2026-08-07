package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_1060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number;
        int pos = 0;
        for (int i = 1; i <= 6; i++){
           number = sc.nextDouble();
           if (number > 0){
               pos++;
           }
        }
        System.out.printf("%d valores positivos\n", pos);
    }
}
