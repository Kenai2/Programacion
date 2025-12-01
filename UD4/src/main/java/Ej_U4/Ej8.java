package Ej_U4;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el Radio");
        int radio = sc.nextInt();
        System.out.println("Ingrese la altura");
        int altura = sc.nextInt();

        double volumen = (1.0/3.0)*Math.PI*(radio*radio)*altura;

        System.out.println("El volumen de un cono es: " +volumen);
    }
}
