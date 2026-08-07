package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_1118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2;
        int ops = 0, notaValid;


        do {
           notaValid = 0;

           do {
               nota1 = sc.nextDouble();
               if (nota1 >= 0 && nota1 <= 10) {
                   notaValid++;
               } else {
                   System.out.println("nota invalida");
               }
           } while (notaValid == 0);

           notaValid = 0;
            do {
                nota2 = sc.nextDouble();
                if (nota2 >= 0 && nota2 <= 10) {
                    notaValid++;
                } else {
                    System.out.println("nota invalida");
                }
            } while (notaValid == 0);

            double media = (nota1 + nota2) / 2;

            System.out.printf("media = %.2f\n", media);

            do {
                System.out.println("novo calculo (1-sim 2-nao)");
                ops = sc.nextInt();
            } while (ops != 1 && ops != 2);

        } while (ops == 1);

    }
}
