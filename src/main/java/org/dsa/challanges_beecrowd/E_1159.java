package org.dsa.challanges_beecrowd;

import java.util.*;

public class E_1159 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n;

    while((n = sc.nextInt()) != 0){
      int soma = 0;
      for (int i = n, k = 1; k <= 5; i++){
        if (i % 2 == 0){
          soma += i;
          k+=1;
        }
      }

      System.out.println(soma);
    }
  }
}
