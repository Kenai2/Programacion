package Ej_UD6_1B;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {

        String cadena1;
        String cadena2;
        String cadena3;
        String letrasNom;
        String letrasApe1;
        String letrasApe2;
        String codigoUsuario;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre: ");
        cadena1 = sc.nextLine();
        System.out.print("Introduce el primer apellido: ");
        cadena2 = sc.nextLine();
        System.out.print("Introduce el segundo apellido: ");
        cadena3 = sc.nextLine();

        letrasNom = cadena1.substring(0, 3).toUpperCase();
        letrasApe1 = cadena2.substring(0, 3).toUpperCase();
        letrasApe2 = cadena3.substring(0, 3).toUpperCase();

        codigoUsuario = letrasNom + letrasApe1 + letrasApe2;

        System.out.println(codigoUsuario);
    }
}
