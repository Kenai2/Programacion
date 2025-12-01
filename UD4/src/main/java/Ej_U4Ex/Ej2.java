package Ej_U4Ex;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el precio1");
        double precio1 = sc.nextDouble();
        System.out.println("Ingresa el precio2");
        double precio2 = sc.nextDouble();

        double precioMa = Math.max(precio1, precio2);
        double precioMe = Math.min(precio1, precio2);

        double diferncia = precioMa - precioMe;

        System.out.printf("Precio más caro: %1.2f€\n precio más barato: %2.2f€\n Diferencia: %3.2f€", precioMa ,  precioMe ,  diferncia);
    }
}
