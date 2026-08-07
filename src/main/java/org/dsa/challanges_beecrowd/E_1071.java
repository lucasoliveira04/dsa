package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio = sc.nextInt();
        int fim = sc.nextInt();

        if (inicio > fim) {
            int temp = inicio;
            inicio = fim;
            fim = temp;
        }

        int soma = 0;

        for (int i = inicio + 1; i < fim; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println(soma);
    }
}
