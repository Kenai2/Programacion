package Ej_U5p2B;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {

        int contMulti = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce numero: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if(i % 3 == 0){
                contMulti++;
            }
        }
        System.out.println("Cantidad de múltiplos de 3: " +contMulti);
    }
}
