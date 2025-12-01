package Ej_UD6_1;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {

        final int TAMANHO = 20;
        int numReal [] = new int[TAMANHO];
        int media = 0;
        int sumaReales = 0;

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<numReal.length;i++){
            System.out.print("Ingrese el numero real : ");
            numReal [i] = sc.nextInt();
            sumaReales += numReal[i];
            media = sumaReales / TAMANHO;
        }
        System.out.println("La media de los numeros es: "+media);
    }
}
