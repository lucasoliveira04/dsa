package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_1145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int linhas = sc.nextInt();
		int fim = sc.nextInt();
		for (int i = 1; i <= fim; i++) {
			System.out.print(i);
			if (i % linhas == 0){
              System.out.println("");  
            } 
			else{
              System.out.print(" ");  
            } 
		}
    }
}
