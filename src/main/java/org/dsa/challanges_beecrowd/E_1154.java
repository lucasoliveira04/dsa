package org.dsa.challanges_beecrowd;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class E_1154 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        int idade = 0;
        int soma = 0;
        int count = 0;

        Locale.setDefault(Locale.US);

        while ((idade = sc.nextInt()) >= 0) {
            if (idade > 0){
                soma += idade;
                count++;
            }
        }

        if (count > 0) {
            double media = (double) soma / count;
            System.out.printf("%.2f\n", media);
        }
    }
}
