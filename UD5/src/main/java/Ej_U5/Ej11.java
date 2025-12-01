package Ej_U5;

import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Opción 1: De Celsius a Fahrenheit.\nOpción 2: De Fahrenheit a Celsius.\nOpción 3: De Celsius a Kelvin.");
        System.out.print("elija una opcion: ");
        int opcion=sc.nextInt();


       if (opcion < 1 || opcion > 3)
       {
           System.out.println("opcion invalida");
       }
       else
       {
           if (opcion > 1 || opcion < 3)
           {
               System.out.print("Ingresa la Temperatura: ");
               double temperatura=sc.nextDouble();

               switch(opcion)
                   {
                   case 1:
                       temperatura = (double) (temperatura*9/5)+32;
                       System.out.printf("Celsius a Fahrenheit: %1.3f "  ,temperatura);
                       break;
                   case 2:
                       temperatura = (double) (temperatura-32)*5/9;
                       System.out.printf("Fahrenheit a Celsius: %1.3f "  , temperatura);
                       break;
                   case 3:
                       temperatura = (double) temperatura+273.15;
                       System.out.printf("Celsius a Kelvin: %1.3f " , temperatura);
                       break;
                   }
           }
       }
    }
}
