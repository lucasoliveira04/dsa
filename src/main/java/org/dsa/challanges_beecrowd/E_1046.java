package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inicio, fim, duracao;

        inicio = sc.nextInt();
        fim = sc.nextInt();

        if (inicio > 1 && fim < 12) {
            duracao = (24 - inicio) + fim;
        } else if (inicio == 0 && fim == 0) {
            duracao = 24;
        }else if (inicio == fim) {
            duracao = 24;
        } else {
            duracao = fim - inicio;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");


    }
}
