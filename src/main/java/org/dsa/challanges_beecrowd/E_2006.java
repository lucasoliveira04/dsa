package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_2006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int typeTea, acertos = 0, player;

        typeTea = sc.nextInt();

        for (int i = 1; i <= 5; i++){
            player = sc.nextInt();
            if (player == typeTea){
                acertos++;
            }
        }

        System.out.println(acertos);
    }
}
