package Ej_U4;

import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el dividendo: ");
        double dividendo = sc.nextDouble();
        System.out.println("Ingrese el divisor: ");
        double divisor = sc.nextDouble();

        double cosiente = dividendo/divisor;
        double resto = dividendo%divisor;

        System.out.println(dividendo +" entre " +divisor +" da un cociente " +cosiente +" y un resto " +resto);
    }
}
