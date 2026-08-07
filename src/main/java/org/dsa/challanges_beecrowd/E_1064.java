package org.dsa.challanges_beecrowd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E_1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Double> numbersPosList = new ArrayList<>();
        double number = 0;
        int pos = 0;

        for (int i = 1; i <= 6; i++){
            number = sc.nextDouble();
            if (number > 0){
                numbersPosList.add(number);
                pos++;
            }
        }

        System.out.printf("%d valores positivos\n", pos);

        double sum = numbersPosList.stream()
                .mapToDouble(Double::doubleValue)
                .sum();

        double media = sum / numbersPosList.size();

        System.out.printf("%.1f\n", media);
    }
}
