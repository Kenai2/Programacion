package Ej_U4Ex;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los Segundos");
        int segundosTotal = sc.nextInt();

        int dias = segundosTotal / 86400;
        int horas = segundosTotal % 86400 / 3600;
        int minutos = segundosTotal % 3600 / 60;
        int segundos = segundosTotal % 60;

        System.out.println("dias: "+dias +"\nhoras: "+horas +"\nminutos: "+minutos +"\nsegundos: "+segundos);
    }
}
