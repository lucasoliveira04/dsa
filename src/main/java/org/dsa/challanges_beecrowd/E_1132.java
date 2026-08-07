package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_1132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, soma = 0;

        x = sc.nextInt();
        y = sc.nextInt();

        if (x > y){
            int temp = x;
            x = y;
            y = temp;
        }

        for (int i = x; i <= y; i++){
            if (i % 13 != 0){
                soma+=i;
            }
        }

        System.out.println(soma);
    }
}
