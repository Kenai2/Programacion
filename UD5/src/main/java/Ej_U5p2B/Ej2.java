package Ej_U5p2B;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {

        final int AnyoAct = 2025;

        Scanner sc = new Scanner(System.in);
        System.out.print("¿En qué año naciste? ");
        int anyoNaci = sc.nextInt();

        int cantiAnyo = AnyoAct - anyoNaci;

        for (int i = 1; i <= cantiAnyo; i++) {
            System.out.println("Has cumplido " + i + " años");
        }
    }
}
