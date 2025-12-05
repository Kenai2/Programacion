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


        String nombrePais [] = {"España","Alemania","Francia","Replublica Dominicana"};
        String medMinMax [] = {"MED MIN MAX"};

        int matriz [][] = new int[TAMANHO1][TAMANHO2];

        for (int i = 0; i<TAMANHO1;i++){
            int suma = 0;
            int max = 0;
            int min = TAMANHOMAX;
            for (int j = 0; j<TAMANHO2;j++){
                matriz[i][j] = (int)(Math.random() * (TAMANHOMAX-TAMANHOMIN+1) + TAMANHOMIN);
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
        for (int i = 0; i<=TAMANHO2;i++){
            System.out.print("\t");
        }
        System.out.printf("%32s \n" , medMinMax);

        for (int i = 0; i<TAMANHO1;i++){
            System.out.printf("%21s: " , nombrePais[i]);
            for (int j = 0; j<TAMANHO2;j++){
                System.out.print(matriz[i][j] +" ");

            }
            System.out.print("| " +media[i]+" " +minimo[i]+" " +maximo[i]);
            System.out.print("\n");
        }
    }
}
