package org.dsa.challanges_beecrowd;

public class E_1156 {
    public static void main(String[] args) {
        double s = 0.0;

        for (int i = 0; i < 20; i++){
            s += (double) (1 + 2 * i) / Math.pow(2, i);
        }

        System.out.printf("%.2f\n", s);
    }
}
