package Ej_U4;

import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese horas trabajadas");
        int horas = sc.nextInt();
        System.out.println("Ingrese la tarifa por horas");
        int tarifa = sc.nextInt();

        double bruto = horas*tarifa;
        double neto = bruto-(0.15*bruto);
        System.out.println("Tu paga en bruto es de " +bruto +" € y en neto es de " +neto +" € (retención del 15%)");
    }
}
