package Ej_U4;

import java.util.Scanner;

public class Ej18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de pan fresco");
        int panFres = sc.nextInt();
        System.out.println("Ingrese el numero de pan duro");
        int panDuro = sc.nextInt();

        double precioPanFr = 1.2;
        double precioPanDu = 0.6;
        double ingresosDia1 = panFres*precioPanFr;
        double ingresosDia2 = panDuro*precioPanDu;
        double totalDia = ingresosDia1+ingresosDia2;

        System.out.println("El total de ingresos del día es " +totalDia +"€");
    }
}
