package Ej_UD6_1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {

        final int TAMANHO = 10;
        int numReal [] = new int[TAMANHO];

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<numReal.length;i++){
            System.out.print("Ingrese el numero real : ");
            numReal [i] = sc.nextInt();
        }
        Arrays.sort(numReal);
        System.out.println("El numero real minimo es : "+numReal[0]);
        System.out.println("El numero real maximo es : "+numReal[9]);
    }
}
