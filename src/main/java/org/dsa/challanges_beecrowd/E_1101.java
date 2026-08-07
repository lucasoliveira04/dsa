package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_1101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            int valorInicial = sc.nextInt();
            int valorFinal = sc.nextInt();

            if (valorInicial <= 0 || valorFinal <= 0){
                break;
            }

            if (valorInicial > valorFinal){
                int invert = valorInicial;
                valorInicial = valorFinal;
                valorFinal = invert;
            }

            int soma = 0;

            for (int i = valorInicial; i <= valorFinal; i++){
                System.out.print(i + " ");
                soma += i;
            }

            System.out.println("Sum=" + soma);
        }

    }
}
