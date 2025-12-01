package Ej_UD6_1;


import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {

        final int TAMANHO = 10;
        int numReal [] = new int[TAMANHO];
        int sumaNumReal = 0;

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<numReal.length;i++){
            System.out.print("Ingrese el numero real : ");
            numReal [i] = sc.nextInt();
            sumaNumReal += numReal[i];
        }

        System.out.println(sumaNumReal);
    }
}
