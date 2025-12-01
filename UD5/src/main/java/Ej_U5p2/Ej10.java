package Ej_U5p2;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {

        int contDieses = 0;
        int num = 0;


       do {
           Scanner sc = new Scanner(System.in);
           System.out.print("Introduce nota: ");
           num = sc.nextInt();
           if (num >= -1 && num <= 10) {
               if (num == 10) {
                   contDieses++;
               }
           }
           else {
               System.out.println("Error: nota invalida");
           }
       }while (num != -1);
       if (contDieses > 0) {
           System.out.println("Han habido " +contDieses +" Diez/Dieces");
       }
       else {
           System.out.println("No han habido Dieces");
       }

    }
}
