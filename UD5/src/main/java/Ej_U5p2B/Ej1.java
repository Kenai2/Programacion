package Ej_U5p2B;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine();

        int longi = palabra.length();
        int mitad = longi/2;

        for(int i = 0; i < mitad; i++){
            System.out.println(palabra);
        }
    }
}
