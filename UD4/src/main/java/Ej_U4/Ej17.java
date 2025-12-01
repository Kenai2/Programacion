package Ej_U4;

import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de empanadillas a enviar:");
        int empanadillas = sc.nextInt();
        System.out.println("Introduce el numero de napolitanas a enviar:");
        int napolitanas = sc.nextInt();

        double pesoEmp = (double) 112;
        double pesoNapol = (double) 75;
        double pesoTotal1 = empanadillas*pesoEmp;
        double pesoTotal2 = napolitanas*pesoNapol;
        double pesoTotal3 = (pesoTotal1+pesoTotal2)/1000.0;

        System.out.println("El peso total del paquete es de: " +pesoTotal3 +"Kg");
    }
}
