package Ej_U5p2;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {

        int num = 0;
        boolean negat = false;

        for (int cont = 1; cont <= 100; cont++) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Ingrese Numero");
            num = sc.nextInt();

            if (num < 0)
            {
                negat = true;
            }
        }
        if (negat)
        {
            System.out.println("se han leido numeros negativos");;
        }
    }
}
