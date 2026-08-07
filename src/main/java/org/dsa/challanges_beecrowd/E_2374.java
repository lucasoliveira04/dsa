package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_2374 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pressaoD, pressaoL, diferenca;

        pressaoD = sc.nextInt();
        pressaoL = sc.nextInt();
        diferenca = pressaoD - pressaoL;
        System.out.println(diferenca);
    }
}
