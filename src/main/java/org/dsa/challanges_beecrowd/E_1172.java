package org.dsa.challanges_beecrowd;

import java.util.*;

public class E_1172 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        int[] x = new int[10];
    
        for (int i = 0; i < x.length; i++) {
          int a = sc.nextInt();
          if (a <= 0){
            a = 1;
          }
          x[i] = a;
        }
    
        for (int i = 0; i < x.length; i++) {
          System.out.println("X["+i+"]"+" = " + x[i]);
        }
  }
}
