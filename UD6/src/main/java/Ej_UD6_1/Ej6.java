package Ej_UD6_1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {

        int vector [];

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numN = sc.nextInt();
        System.out.print("Ingrese un número entero: ");
        int numM = sc.nextInt();

        vector = new int[numN];
        for(int i=0;i< vector.length;i++){
            vector[i] = numM;
        }
        System.out.println(Arrays.toString(vector));
    }
}
