package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inicio, fim, N;

        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            inicio = sc.nextInt();
            fim = sc.nextInt();
            int soma = 0;

            if (inicio > fim) {
                int invert = inicio;
                inicio = fim;
                fim = invert;
            }

            for (int j = inicio + 1; j < fim; j++) {
                if (j % 2 != 0) {
                    soma += j;
                }
            }

            System.out.println(soma);
        }
    }
}
