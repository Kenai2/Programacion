package Ej_U5p2;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero: ");
        int num = sc.nextInt();

        for (int contNum = 1; contNum <= num; contNum++) {
            System.out.print(contNum);
            if (contNum < num) {
                System.out.print(", ");
            }
        }
    }
}
