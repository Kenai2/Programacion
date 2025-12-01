package Ej_UD6_1B;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {

        String cadena1;
        String cadena2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el texto: ");
        cadena1 = sc.nextLine();
        System.out.print("Introduce el texto: ");
        cadena2 = sc.nextLine();

        boolean iguales;
        iguales = cadena1.equalsIgnoreCase(cadena2);

        if (iguales) {
            System.out.println("Son iguales");
        }
        else {
            System.out.println("No son iguales");
        }
    }
}
