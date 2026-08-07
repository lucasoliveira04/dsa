package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number, par = 0, impar = 0, positivo = 0, negativo = 0;

        for (int i = 1; i <= 5; i++){
            number = sc.nextInt();
            if (number % 2 == 0){
                par++;
            } else {
                impar++;
            }

            if (number > 0){
                positivo++;
            } else {
                if (number == 0){
                    negativo--;
                }
                negativo++;
            }
        }

        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
    }
}
