package Ej_U5;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese numero");
        int num1 = sc.nextInt();
        System.out.println("ingrese numero 2");
        int num2 = sc.nextInt();

        if(num1>num2)
        {
            System.out.println(num1 +" es mayor que num2");
        }
        else
        {
            if (num1<num2)
            {
                System.out.println(num2 +" es mayor que num1");
            }
            else
            {
                System.out.println(num1 +" es igual a num2");
            }
        }
    }
}
