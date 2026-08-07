package org.dsa.challanges_beecrowd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class E_1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++){
            number = sc.nextInt();
            list.add(number);
        }

        int maiorNumero = Collections.max(list);
        int index = list.indexOf(maiorNumero) + 1;

        System.out.println(maiorNumero);
        System.out.println(index);
    }
}
