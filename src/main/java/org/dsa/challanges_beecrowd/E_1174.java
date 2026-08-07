package org.dsa.challanges_beecrowd;

import java.util.*;

public class E_1174{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    double[] array = new double[100];

    for (int i = 1; i < array.length - 1; i++) {
      array[i + 1] = i + 1;
    }

    double number;

    for (int i = 0; i < array.length; i++) {
      number = sc.nextDouble();
      array[i] = number;
    }

    for (int i = 0; i < array.length; i++) {
      if (array[i] <= 10) {
        System.out.println("A["+i+"] = " + array[i]);
      }
    }

  }
}
