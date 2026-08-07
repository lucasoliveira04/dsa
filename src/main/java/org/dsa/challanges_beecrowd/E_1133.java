package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_1133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inicio, fim;

        inicio = sc.nextInt();
        fim = sc.nextInt();

        if (inicio > fim){
            int invert = inicio;
            inicio = fim;
            fim = invert;
        }

        if (inicio < 0){
            inicio*=-1;
        }

        if (fim < 0){
            fim*=-1;
        }

        for (int i = inicio + 1; i < fim; i++){
            if (i % 5 == 2 || i % 5 == 3){
                System.out.println(i);
            }
        }
    }
}
