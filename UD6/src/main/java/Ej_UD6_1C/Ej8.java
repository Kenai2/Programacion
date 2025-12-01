package Ej_UD6_1C;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {

        final int TAMANHO1 = 4;
        final int TAMANHO2 = 10;
        final int TAMANHOMAX = 210;
        final int TAMANHOMIN = 140;

        int media = 0;
        int numMaximo = Integer.MAX_VALUE;
        int numMinimo = Integer.MIN_VALUE;

        String nombrePais [] = {"España","Alemania","Francia","Italia"};


        int matriz [][] = new int[TAMANHO1][TAMANHO2];

        for (int i = 0; i<TAMANHO1;i++){
            for (int j = 0; j<TAMANHO2;j++){
                matriz[i][j] = (int)(Math.random() * (TAMANHOMAX-TAMANHOMIN+1) + TAMANHOMIN);
                System.out.println(matriz[i][j]);
            }
        }
    }
}
