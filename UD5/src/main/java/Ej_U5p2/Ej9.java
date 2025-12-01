package Ej_U5p2;

public class Ej9 {
    public static void main(String[] args) {

        int contSuma = 0;
        int contProd = 1;

        for (int cont = 1; cont <= 10; cont++) {

            contSuma = contSuma + cont;
            contProd = contProd * cont;
        }
        System.out.println("El resultado de la suma es: " + contSuma);
        System.out.println("El resultado de la producto es: " + contProd);
    }
}
