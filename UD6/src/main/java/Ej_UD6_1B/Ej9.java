package Ej_UD6_1B;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {

        String frase;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        frase = sc.nextLine();
        System.out.print("Introduce una vocal: ");
        char vocal = sc.next().charAt(0);

        char vocal2 = Character.toUpperCase(vocal);
        String frase2 = frase.replace(vocal, vocal2);

        System.out.println(frase2);
    }
}
