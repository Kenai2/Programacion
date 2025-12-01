package Ej_U5;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero decimal: ");
        double numDeci = sc.nextDouble();

        int num = (int) numDeci;

        if (num % 2 == 0)
        {
            System.out.println(num +" Es par");
        }
        else
        {
            System.out.println(num +" Es impar");
        }
    }
}
