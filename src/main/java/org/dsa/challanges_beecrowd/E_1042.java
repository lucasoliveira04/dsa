package org.dsa.challanges_beecrowd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E_1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            list.add(sc.nextInt());
        }

        list.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println();

        list.forEach(System.out::println);





    }
}
