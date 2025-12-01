package Ej_UD6_1B;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {

        String cadena;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cadena de texto: ");
        cadena = sc.nextLine();

        String [] palabras = cadena.split(" ");

        for(int i=0; i<palabras.length; i++){
            System.out.println(palabras[i]);
        }
    }
}
