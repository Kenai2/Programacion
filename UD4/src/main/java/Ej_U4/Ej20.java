package Ej_U4;

import java.util.Scanner;

public class Ej20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la invercion inicial");
        int inicial = sc.nextInt();

        double interesAnual = 0.04;
        double balance1 = inicial * (1+interesAnual);
        double balance2 = balance1 * (1+interesAnual);
        double balance3 = balance2 * (1+interesAnual);

        System.out.printf("Balance año 1: %1.2f€\n" , balance1);
        System.out.printf("Balance año 2: %1.2f€\n" ,  balance2);
        System.out.printf("Balance año 3: %1.2f€\n" ,  balance3);
    }
}
