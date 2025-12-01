package Ej_U5;

import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese Importe");
        double importe = sc.nextDouble();

        if (importe < 0)
        {
            System.out.println("Error importe negativo");
        }
        else
        {
            if (importe > 100) {
                importe = importe - (importe * 0.1);
                System.out.println(importe + "€ se aplica un descuento del 10%");
            } else {
                if (importe >= 50 && importe <= 100) {
                    System.out.println(importe + "€ no se aplican descuentos ni recargas");
                } else {
                    if (importe < 50) {
                        importe = importe + 5;
                        System.out.println(importe + "€ se aplica un recargo de 5€");
                    }
                }
            }
        }
    }
}
