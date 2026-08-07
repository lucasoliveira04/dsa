package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_1149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, n, soma = 0;

        a = sc.nextInt();
        n = sc.nextInt();

        while (n <= 0){
            n = sc.nextInt();
        }

        for (int i = 1; i <= n; i++){
            soma += a;
            a++;
        }
        System.out.println(soma);
    }
}
