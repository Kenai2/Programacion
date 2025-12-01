package Ej_U5p2B;

import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {

        int numMayores = 0;
        int num = 0;
        int contFallo = 0;
        int contNum = 0;
        int numIntro = 0;
        int numValidos = 0;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese un número (debe ser mayor que el anterior): ");
            num = sc.nextInt();
            if (num != 0) {
                numIntro++;
            }


            if (num <= -1) {
                contFallo++;
                System.out.println("Fallo! Errores = " +contFallo);

            }
            else {
                if (num > numMayores && num != 0) {
                    numMayores = num;
                    contNum++;
                    numValidos++;
                    System.out.println("Número " +contNum+": "+numMayores);
                }
                else if (num < numMayores && num != 0) {
                    numMayores = num;
                    contFallo++;
                    System.out.println("Fallo! Errores = " +contFallo);
                }
            }
        }while(num != 0);

        System.out.println("----------------------------------");
        System.out.println("Total de números introducidos: " +numIntro);
        System.out.println("Total de números válidos: "  +numValidos);
        System.out.println("Total de fallos: " +contFallo);
    }
}
