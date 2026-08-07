package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_1043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, perimetro, areaTrapezio;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a){
            perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f\n", perimetro);
        } else {
            areaTrapezio = ((a + b) * c) / 2;
            System.out.printf("Area = %.1f\n", areaTrapezio);
        }
    }
}
