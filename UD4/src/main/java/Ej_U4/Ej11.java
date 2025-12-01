package Ej_U4;

import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el Radio: ");
        int radio = sc.nextInt();

        double diametro = radio*2;
        double area = Math.pow(Math.PI*radio,2);
        double volumen = Math.pow((4/3)*Math.PI*radio,3);

        System.out.println("El resultado de la longitud de la circunferencia es: " +diametro);
        System.out.println("El resultado del area es: " +area);
        System.out.println("El resultado de la volumen es: " +volumen);
    }
}
