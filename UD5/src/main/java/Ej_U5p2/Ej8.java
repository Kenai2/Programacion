package Ej_U5p2;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {

        boolean negat = false;
        int num = 0;
        int contNega = 0;
        int contpos = 0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese Numero");
        num = sc.nextInt();

        while (num != 0) {

            System.out.println("Ingrese Numero");
            num = sc.nextInt();
            if (num < 0)
            {
                negat = true;
                contNega++;
            }
            else {
                contpos++;
            }
        }
        if (negat = true || negat == false)
        {
            System.out.println("se han leido " +contNega  +" numeros negativos");;
            System.out.println("se han leido " +contpos  +" numeros positivos");;
        }
    }
}
