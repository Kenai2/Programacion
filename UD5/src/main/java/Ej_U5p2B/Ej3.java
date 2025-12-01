package Ej_U5p2B;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            if(i % 2 == 0){
                System.out.print(i +" ");
            }
        }
    }
}
