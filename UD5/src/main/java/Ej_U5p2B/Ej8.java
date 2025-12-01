package Ej_U5p2B;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce numero A: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce numero B: ");
        int num2 = sc.nextInt();

        while (num1 > num2){
            System.out.println("N2 debe ser mayor que N1, vuelve a introducirlo: ");
            num2 = sc.nextInt();
        }
        for (int i = num1; i<=num2; i++){
            System.out.print(num1+" - ");
            num1++;
        }
    }
}
