package Ej_U5p2;

public class Ej2 {
    public static void main(String[] args) {

        for (int contNum = 0; contNum <= 200; contNum+=2) {
            System.out.print(contNum);
            if (contNum < 200) {
                System.out.print(", ");
            }
        }
    }
}
