package Ej_UD6_1C;



public class Ej8 {
    public static void main(String[] args) {

        final int TAMANHO1 = 4;
        final int TAMANHO2 = 10;
        final int TAMANHOMAX = 210;
        final int TAMANHOMIN = 140;

        int media [] = new int[TAMANHO1];
        int maximo [] = new int[TAMANHO1];
        int minimo [] = new int[TAMANHO1];


        String nombrePais [] = {"España","Alemania","Francia","Italia"};


        int matriz [][] = new int[TAMANHO1][TAMANHO2];

        for (int i = 0; i<TAMANHO1;i++){
            int suma = 0;
            int max = 0;
            int min = TAMANHOMAX;
            for (int j = 0; j<TAMANHO2;j++){
                matriz[i][j] = (int)(Math.random() * (TAMANHOMAX-TAMANHOMIN+1) + TAMANHOMIN);
                //System.out.println(matriz[i][j]);
                suma += matriz[i][j];
                if(max < matriz[i][j]){
                    max = matriz[i][j];
                }
                if(min > matriz[i][j]){
                    min = matriz[i][j];
                }
            }
            if (i == 0){
                media [i] = suma / TAMANHO2;
            }
            else if (i == 1){
                media [i] = suma / TAMANHO2;
            }
            else if (i == 2){
                media [i] = suma / TAMANHO2;
            }
            else if (i == 3){
                media [i] = suma / TAMANHO2;
            }
            maximo[i] = max;
            minimo[i] = min;
        }
        for (int i = 0; i<12;i++){
            System.out.print("\t");
        }
        System.out.print("MED MIN MAX" +"\n");


        /*System.out.println(nombrePais [0] +": " + + media [0] +" " +maximo [0] +" " +minimo [0]);
        System.out.println(nombrePais [1] +": " + media [1] +" " +maximo [1] +" "  +minimo [1]);
        System.out.println(nombrePais [2] +": " + media [2] +" "  +maximo [2] +" "  +minimo [2]);
        System.out.println(nombrePais [3] +": " + media [3] +" "  +maximo [3] +" "   +minimo [3]);*/
    }
}
