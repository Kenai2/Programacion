package Ej_UD6_1;


import java.util.Arrays;

public class Ej14 {
    public static void main(String[] args) {

        final int numFinal = 10;
        final int numArray = 55;
        int array[] = new int[numArray];
        int contArray = 0;


        for (int i = 0; i<=numFinal; i++) {
            for (int j = 0; j<i; j++) {
                array[contArray] = i;
                contArray++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
