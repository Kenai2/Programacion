package Ej_U5p2;

public class Ej3 {
    public static void main(String[] args) {

        for (int contNum = 0; contNum <= 200; contNum++) {
            if (contNum % 2 == 0) {
                System.out.print(contNum);
                if (contNum < 200) {
                    System.out.print(", ");
                }
            }
        }
    }
}
