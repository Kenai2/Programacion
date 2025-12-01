package Ej_UD6_1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {

        final int TAMANHO = 20;
        int numReal [] = new int[TAMANHO];
        int sumaNegativos = 0;
        int sumaPositivos = 0;

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<numReal.length;i++){
            System.out.print("Ingrese el numero real : ");
            numReal [i] = sc.nextInt();
            if (numReal [i] < 0){
                sumaNegativos += numReal[i];
            }
            else {
                sumaPositivos += numReal[i];
            }
        }
        System.out.println("La suma de negativos es: " + sumaNegativos);
        System.out.println("La suma de positivos es: " + sumaPositivos);
    }
}
