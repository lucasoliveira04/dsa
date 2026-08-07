package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_1175 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[20];

        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length / 2; i++) {
            for (int j = array.length - 1 - i; j > i; j--) {
                int aux = array[i];
                array[i] = array[j];
                array[j] = aux;
                break;
            }
        }
        for (int i = 0; i < array.length; i++){
            System.out.println("N[" + i + "] = " + array[i]);
        }
    }
}
