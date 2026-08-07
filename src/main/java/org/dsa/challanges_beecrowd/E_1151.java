package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_1151 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int primeiro = 0, segundo = 1, proximo;
        int n = sc.nextInt();

        System.out.print(primeiro);

        for (int i = 1; i < n; i++){
            System.out.print(" " + segundo);
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        System.out.println();
    }
}
