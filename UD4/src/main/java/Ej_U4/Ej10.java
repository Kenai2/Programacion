package Ej_U4;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de la operacion");
        int op = sc.nextInt();
        System.out.println("Ingrese el 2º numero de la operacion");
        int op2 = sc.nextInt();

        double suma = op + op2;
        double resta = op - op2;
        double multiplicacion = op * op2;
        double division = op / op2;

        System.out.println("El resultado de la suma es: " +suma);
        System.out.println("El resultado de la resta es: " +resta);
        System.out.println("El resultado de la multiplicación es: " +multiplicacion);
        System.out.println("El resultadode la divición es: " +division);
    }
}
