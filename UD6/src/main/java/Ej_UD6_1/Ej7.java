package Ej_UD6_1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {

        int vector [];
        int num1 = 0;
        int num2 = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el valor: ");
        num1 = sc.nextInt();
        System.out.print("Ingresa el valor2: ");
        num2 = sc.nextInt();

        while(num1 > num2){
            System.out.println("Error: Ingresa el valor: ");
            num2 = sc.nextInt();
        }
        int contador = 0;
        for (int i = num1; i < num2; i++) {
            contador = contador + 1;
        }
        contador = contador + 1;
        vector = new int[contador];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = num1++;
        }
        System.out.println(Arrays.toString(vector));
    }
}
