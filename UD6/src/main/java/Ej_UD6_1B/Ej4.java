package Ej_UD6_1B;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {

        String cadena;
        int tamanio = 0;
        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese frase: ");
        cadena = sc.nextLine();

        tamanio = cadena.length();



        for (int i=0; i<tamanio; i++){
            if (cadena.charAt(i) == 'A' || cadena.charAt(i) == 'a'){
                contadorA++;
            }
            if (cadena.charAt(i) == 'E' || cadena.charAt(i) == 'e'){
                contadorE++;
            }
            if (cadena.charAt(i) == 'I' || cadena.charAt(i) == 'i'){
                contadorI++;
            }
            if (cadena.charAt(i) == 'O' || cadena.charAt(i) == 'o'){
                contadorO++;
            }
            if (cadena.charAt(i) == 'U' || cadena.charAt(i) == 'u'){
                contadorU++;
            }
        }
        System.out.print("El número de 'a' es: " +contadorA +"\n");
        System.out.print("El número de 'e' es: " +contadorE +"\n");
        System.out.print("El número de 'i' es: " +contadorI +"\n");
        System.out.print("El número de 'o' es: " +contadorO +"\n");
        System.out.print("El número de 'u' es: " +contadorU);
    }
}
