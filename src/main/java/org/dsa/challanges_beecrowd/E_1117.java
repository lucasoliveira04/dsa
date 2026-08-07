package org.dsa.challanges_beecrowd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E_1117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Double> list = new ArrayList<>();

        double nota, valid = 0;

        while (valid < 2){
            nota = sc.nextDouble();

            if (nota >= 0 && nota <= 10){
                list.add(nota);
                valid++;
            } else {
                System.out.println("nota invalida");
            }

            if (valid == 2){
                double sum = list.stream().mapToDouble(Double::doubleValue).sum();
                double media = sum / 2;
                System.out.printf("media = %.2f\n", media);
            }

        }
    }
}
