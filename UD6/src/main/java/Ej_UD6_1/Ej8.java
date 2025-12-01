package Ej_UD6_1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {

        final int TAMANHO = 100;
        double vector [] = new double[TAMANHO];
        double numR  = 0;
        int contIgual = 0;
        int contSuperior = 0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (Math.floor(Math.random()*100)/100);
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un número real: ");
        numR = input.nextDouble();
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == numR) {
                contIgual++;
            }
            else  if (vector[i] > numR) {
                contSuperior++;
            }
        }
        System.out.println("Cantidad de numeros superiores: " + contSuperior);
        System.out.println("Cantidad de numeros iguales: " + contIgual);
        System.out.println(Arrays.toString(vector));
    }
}
