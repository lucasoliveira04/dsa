package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_1131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int golsInter, golsGremio, ops = 1, totalJogos = 0, vitoriasInter = 0, vitoriasGremio = 0, empates = 0;

        while (ops == 1){
            totalJogos++;
            golsInter = sc.nextInt();
            golsGremio = sc.nextInt();
            if (golsInter > golsGremio){
                vitoriasInter++;
            } else if (golsGremio > golsInter) {
                vitoriasGremio++;
            } else {
                empates++;
            }

            System.out.printf("Novo grenal (1-sim 2-nao)\n");
            ops = sc.nextInt();

            while (ops != 1 && ops != 2){
                System.out.printf("Novo grenal (1-sim 2-nao)\n");
                ops = sc.nextInt();
            }
        }

        System.out.printf("%d grenais\n", totalJogos);
        System.out.printf("Inter:%d\n", vitoriasInter);
        System.out.printf("Gremio:%d\n", vitoriasGremio);
        System.out.printf("Empates:%d\n", empates);

        if (vitoriasInter > vitoriasGremio) {
            System.out.printf("Inter venceu mais\n");
        } else if (vitoriasGremio > vitoriasInter) {
            System.out.printf("Gremio venceu mais\n");
        } else {
            System.out.printf("Nao houve vencedor\n");
        }

    }
}
