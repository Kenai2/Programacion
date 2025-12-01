package Ej_U5;

import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese horas: ");
        int horas = sc.nextInt();
        System.out.print("Ingrese minutos: ");
        int minutos = sc.nextInt();
        System.out.print("Ingrese segundos: ");
        int segundos = sc.nextInt();

        if (horas > 23 || minutos > 59 || segundos > 59 || horas < 0 || minutos < 0 ||segundos < 0)
        {
            System.out.println("Error: hora invalida");
        }
        else
        {
            if (segundos == 59)
            {
                segundos = 00;
                if (minutos==59)
                {
                    minutos = 00;
                    if (horas==23)
                    {
                        horas = 00;
                    }
                    else
                    {
                        horas += 1;
                    }
                }
                else
                {
                    minutos += 1;
                }
            }
            else
                {
                    segundos += 1;
                }
            System.out.printf("%02d:%02d:%02d", horas, minutos , segundos);
        }
    }
}
