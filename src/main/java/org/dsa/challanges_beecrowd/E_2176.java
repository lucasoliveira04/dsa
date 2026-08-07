package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_2176 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s;
        s = sc.next();

        int numerosOne = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                numerosOne++;
            }
        }

        if (numerosOne % 2 == 0){
            System.out.println(s + "0");
        } else {
            System.out.println(s + "1");
        }

    }
}
