package Ej_U4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad a invertir");
        int cantidad = sc.nextInt();
        System.out.println("Ingrese el interes anual");
        int interes = sc.nextInt();
        System.out.println("Ingrese el numero de meses");
        int meses = sc.nextInt();


        int anyos = 12;
        int duracion = meses/anyos;
        double interesAnyo = Math.pow(((double) interes /100+1),duracion);
        double capitalFial = (double) cantidad*interesAnyo;

        System.out.printf("El Capital final es de: %1.2f€" ,capitalFial );
    }
}
