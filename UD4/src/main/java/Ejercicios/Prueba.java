package Ejercicios;

import java.text.DecimalFormat;

public class Prueba {
    public static void main(String[] args) {
/*
        int n1 = 2;
        int cuadrado = n1 * n1;
        System.out.printf("El cuadrado de %1$d es %2$d%n", n1, n1*n1);
        System.out.printf("El cuñado de %1$s tiene %2$d años%n", "Pepito", 30);
      */

        String nombre = "Ana";
        int edad = 20;
        double nota = 8.756;
        int poblacion = 1234567;
        // Formatos básicos
        System.out.printf("Nombre: %s, Edad: %d, Nota: %.2f%n", nombre, edad, nota);
        // -> Nombre: Ana, Edad: 20, Nota: 8.76
        // Alineación y ancho (posiciones que ocupa se rellenan con espacios a la izquierda)
        System.out.printf("|%10s|%5d|%8.2f|%n", "Producto", 5, 12.3);
        // -> | Producto| 5| 12.30|
        // Alineación a la izquierda
        System.out.printf("|%-10s|%-5d|%-8.2f|%n", "Peras", 12, 2.35);
        // -> |Peras |12 |2.35 |
        // Relleno con ceros (ocupando 9 posiciones totales incluyendo el punto decimal)
        System.out.printf("Precio con ceros: %09.2f%n", 12.3);
        // -> Precio con ceros: 000012.30
        // Separador de miles
        System.out.printf("Población: %,d habitantes%n", poblacion);
        // -> Población: 1.234.567 habitantes
        // Mostrar siempre el signo y negativos entre paréntesis
        System.out.printf("Signos: %+d | %+d y negativo con paréntesis: %(d%n", 42, -42, -42);
        // -> Signos: +42 | -42 y negativo con paréntesis: (42)
        // Usar un mismo argumento varias veces (símbolo 1$, 2$, 3$ ...)
        System.out.printf("Nota %1$.2f repetida: %1$.3f%n", nota);
        // -> Nota 8,76 Misma nota: 8,756
    }
}
