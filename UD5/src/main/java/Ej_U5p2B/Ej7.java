package Ej_U5p2B;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {

        double num2 = 0;
        double suma = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantas notas vas a introducir? ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.print("Dime número " +i +": ");
            num2 = sc.nextDouble();
            suma += num2;
        }
        double media = suma/num;
        System.out.println(media);
    }
}
