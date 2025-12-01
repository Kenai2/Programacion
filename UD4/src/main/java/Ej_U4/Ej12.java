package Ej_U4;

import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el Precio Original");
        int precioOr = sc.nextInt();
        System.out.println("Ingrese el Precio Real");
        int precioRe = sc.nextInt();

        double precio = (double) 100*(precioOr-precioRe)/precioOr;
        System.out.printf("El descuento es: %1$.2f%%", precio);
    }
}
