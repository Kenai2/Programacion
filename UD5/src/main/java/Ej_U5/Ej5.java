package Ej_U5;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero");
        int num1 = sc.nextInt();

        if (num1 >= 0)
        {
            System.out.println(num1 +" es positivo");
        }
        else
        {
            System.out.println(num1 +" es negativo");
        }
    }
}
