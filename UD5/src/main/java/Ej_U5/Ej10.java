package Ej_U5;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad=sc.nextInt();
        System.out.print("Ingrese su ingreso anual: ");
        double ingreso=sc.nextDouble();

        int edadMin = 16;
        double ingresoMin = (double) 1000;

        if (edad<0 || ingreso<0) {
            System.out.println("Error: edad e ingreso negativo");
        }
        else {
            if (edad < edadMin || ingreso < ingresoMin) {
                System.out.println("No cumple con los requisitos para tributar (Minimo para tributar " + edadMin + " años y " + ingresoMin + "€)");
            } else {
                if (edad >= edadMin || ingreso >= ingresoMin) {
                }
                System.out.println("Cumple con los requisitos para tributar, " + edad + " años (Minimo para tributar " + edadMin + " años)" + " e ingreso de " + ingreso + "€ (minimo para tributar " + ingresoMin + ")");
            }
        }
    }
}
