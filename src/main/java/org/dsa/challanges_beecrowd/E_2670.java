package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_2670 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = 0, a2 = 0, a3 = 0, tempo_primeiro, tempo_segundo, tempo_terceiro, menor_tempo;

        a1 = sc.nextInt();
        a2 = sc.nextInt();
        a3 = sc.nextInt();

        tempo_primeiro = a2 * 2 + a3 * 4;
        tempo_segundo = a1 * 2 + a3 * 2;
        tempo_terceiro = a1 * 4 + a2 * 2;

        menor_tempo = Math.min(tempo_primeiro, Math.min(tempo_segundo, tempo_terceiro));

        System.out.println(menor_tempo);

    }
}
