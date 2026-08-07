package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_1134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ops, alcool = 0, gasolina = 0, diesel = 0;

        do {
            ops = sc.nextInt();

            if (ops == 1){
                alcool++;
            } else if (ops == 2) {
                gasolina++;
            } else if (ops == 3){
                diesel++;
            } else if (ops == 4) {
                break;
            }

        } while (true);

        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d\n", alcool);
        System.out.printf("Gasolina: %d\n", gasolina);
        System.out.printf("Diesel: %d\n", diesel);
    }
}
