package Ej_UD6_1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {

        final int TAMANHO = 10;
        int numReal [] = new int[TAMANHO];

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<numReal.length;i++){
            System.out.print("Ingrese el numero real : ");
            numReal [i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(numReal));
    }
}
