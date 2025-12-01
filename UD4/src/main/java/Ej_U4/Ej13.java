package Ej_U4;

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese millas marinas");
        int millas = sc.nextInt();

        int metros = millas*1852;
        System.out.println("La distancia en metros es: " +metros);
    }
}
