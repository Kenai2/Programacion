package Ej_U4;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el Base: ");
        int base = sc.nextInt();
        System.out.println("Ingrese el Altura: ");
        int altura = sc.nextInt();

        double area = (base * altura) /2;

        System.out.println("El area es: " +area);
    }
}
