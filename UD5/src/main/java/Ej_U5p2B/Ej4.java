package Ej_U5p2B;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();

        if (num <= 0){
            for (int i = 0; i > num; i--){
                System.out.print("#");
            }
        }
        else{
            for (int i = 1; i <= num; i++){
                System.out.print("*");
            }
        }
    }
}
