package org.dsa.challanges_beecrowd;

import java.util.*;

public class E_1173{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        int[] x = new int[10];
    
        int a = sc.nextInt();
    
        for (int i = 0; i < x.length; i++){
          x[i] = a;
          a+=a;
        }
    
        for (int i = 0; i < x.length; i++){
          System.out.println("N[" + i + "]" + " = " + x[i]);
        }
  }
}
