package org.dsa.challanges_beecrowd;

public class E_1098 {
    public static void main(String[] args) {
        for (double i = 0; i <= 2.01; i += 0.2){
            for (int j = 1; j < 4; j ++){
                if (i == 0 || i == 1 || Math.abs(i - 2) < 0.001){
                    System.out.printf("I=%.0f J=%.0f\n", i, j+i);
                }
                else{
                    System.out.printf("I=%.1f J=%.1f\n", i, j+i);
                }
            }
        }
    }
}
