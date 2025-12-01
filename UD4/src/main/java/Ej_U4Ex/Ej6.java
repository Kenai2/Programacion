package Ej_U4Ex;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero decimal");
        double decimal = sc.nextDouble();

        int entero = (int) decimal;
        double soloDecimal = decimal - entero;

        System.out.printf("la parte entera es: %1\n la parte solo decimal es: %2.3f\n" , entero , soloDecimal);
    }
}
