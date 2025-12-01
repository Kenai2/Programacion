package Ej_U5p2;

public class Ej11 {
    public static void main(String[] args) {


        int acuImpar = 0;
        int acuPar = 0;
        int pares = 0;
        int impares = 0;

        for (int acu = 100; acu <= 200; acu++) {
            if (acu % 2 == 0) {
                acuPar = acu;
                pares = pares + acuPar;
            }
            else  {
                acuImpar = acu;
                impares = impares + acuImpar;
            }
        }
        System.out.println("La suma de los pares es: " + pares +" y la resta es: " + impares);
    }
}
