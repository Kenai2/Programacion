package Ej_U4;

import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero entero");
        int numero = sc.nextInt();

        int suma = numero*(numero+1)/2;
        System.out.println("La suma de los primeros números enteros desde 1 hasta " +numero +" es "+suma);
    }
}
