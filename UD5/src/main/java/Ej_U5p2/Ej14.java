package Ej_U5p2;

import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {

        final int Quinientos = 500;
        final int Doscientos = 200;
        final int Cien = 100;
        final int Cincuenta = 50;
        final int veinte = 20;
        final int Diez = 10;
        final int Cinco = 5;

        int contQui = 0;
        int contDos = 0;
        int contCien = 0;
        int contCinc = 0;
        int contVeinte = 0;
        int contDiez = 0;
        int contCinco = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor de euros (Múltiplo de 5): ");
        int euros = sc.nextInt();

        while (euros <= 0 || euros % 5 != 0) {
            System.out.print("Valor inválido: debe ser múltiplo de 5 y un número positivo");
            System.out.print("Ingrese el valor de euros (Múltiplo de 5): ");
            euros = sc.nextInt();
        }
        while (euros >= Quinientos) {
            contQui++;
            euros -= Quinientos;
        }
        while (euros >= Doscientos) {
            contDos++;
            euros -= Doscientos;
        }
        while (euros >= Cien) {
            contCien++;
            euros -= Cien;
        }
        while (euros >= Cincuenta) {
            contCinc++;
            euros -= Cincuenta;
        }
        while (euros >= veinte) {
            contVeinte++;
            euros -= veinte;
        }
        while (euros >= Diez) {
            contDiez++;
            euros -= Diez;
        }
        while (euros >= Cinco) {
            contCinco++;
            euros -= Cinco;
        }
        System.out.println("La cantidad de euros en billetes de quinientos es de: " + contQui +", de 200 es: " +contDos +", de 100 es: " +contCien
                +", de 50 es: " +contCinc +", de 20 es: " +contVeinte +", de 10 es: " +contDiez +", de 5 es: " +contCinco);
    }
}
