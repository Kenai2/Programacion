package Ej_U5;

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad < 0){
            System.out.println("Error: edad invalida");
        }
        else {
            if (edad < 4 && edad > 0)
            {
                System.out.print("El cliente entra gratis");
            }
            else {
                if(edad >= 4 && edad <= 17){
                    System.out.println("El cliente pagara una entrada de 5€");
                }
                else{
                    if(edad >= 18){
                        System.out.println("El cliente pagara una entrada de 10€");
                    }
                }
            }

        }
    }
}
