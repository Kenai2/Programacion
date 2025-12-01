package Ej_U5;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el numero 2");
        int num2 = sc.nextInt();

        if (num1>num2)
        {
            System.out.println(num1 +", " +num2);
        }
        else
        {
            System.out.println(num2 +", " +num1);
        }
    }
}
