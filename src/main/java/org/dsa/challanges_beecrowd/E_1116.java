package org.dsa.challanges_beecrowd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E_1116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        int n;

        double n1, n2, div;

        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            n1 = sc.nextDouble();
            n2 = sc.nextDouble();

            if (n2 == 0){
                list.add("divisao impossivel");
            } else {
                div = n1 / n2;
                list.add(String.format("%.1f", div));
            }
        }
        list.forEach(System.out::println);
    }
}
