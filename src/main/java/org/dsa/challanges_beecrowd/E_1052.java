package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_1052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mes = sc.nextInt();
        String message;

        switch (mes) {
            case 1:
                message = "January";
                break;
            case 2:
                message = "February";
                break;
            case 3:
                message = "March";
                break;
            case 4:
                message = "April";
                break;
            case 5:
                message = "May";
                break;
            case 6:
                message = "June";
                break;
            case 7:
                message = "July";
                break;
            case 8:
                message = "August";
                break;
            case 9:
                message = "September";
                break;
            case 10:
                message = "October";
                break;
            case 11:
                message = "November";
                break;
            case 12:
                message = "December";
                break;
            default:
                message = "Mês inválido";
                break;
        }

        System.out.println(message);
    }
}
