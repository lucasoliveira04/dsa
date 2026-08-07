package org.dsa.challanges_beecrowd;

import java.lang.reflect.Array;
import java.util.*;

public class E_1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        List<Double> lados = new ArrayList<>();
        lados.add(sc.nextDouble());
        lados.add(sc.nextDouble());
        lados.add(sc.nextDouble());

        lados.sort(Comparator.reverseOrder());

        a = lados.get(0);
        b = lados.get(1);
        c = lados.get(2);

        if (a >= b + c){
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (a * a == b * b + c * c) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (a * a > b * b + c * c) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (a * a < b * b + c * c) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (a == b && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (a == b || b == c || a == c) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

    }
}
