package Ej_U5p2B;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) throws InterruptedException {

        int formHora;
        String horas;
        int formMin;
        String minutos;
        int formSeg;
        String segundos;
        final int longi = 8;
        DecimalFormat df = new DecimalFormat("00");

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una hora en formato (HH:MM:SS): ");
        String hora = sc.nextLine();

        while (hora.length() != longi) {
            System.out.print("Formato incorrecto, vuelve a introducirla: ");
            hora = sc.nextLine();
        }
        do {
            horas = hora.substring(0, 2);
            formHora = Integer.parseInt(horas);
            minutos = hora.substring(3, 5);
            formMin = Integer.parseInt(minutos);
            segundos = hora.substring(6, 8);
            formSeg = Integer.parseInt(segundos);
            if (formHora > 23 || formMin > 59 || formSeg > 59) {
                System.out.print("Formato incorrecto, vuelve a introducirla: ");
                hora = sc.nextLine();
            }
        }while (formHora > 23 || formMin > 59 || formSeg > 59);

        while (true)
        {
            if (formSeg == 59)
            {
                formSeg = 0;
                if (formMin==59)
                {
                    formMin = 0;
                    if (formHora==23)
                    {
                        formHora = 0;
                    }
                    else
                    {
                        formHora += 1;
                    }
                }
                else
                {
                    formMin += 1;
                }
            }
            else
            {
                formSeg += 1;
            }
            Thread.sleep(1000);
            System.out.println(df.format(formHora) +":"+ df.format(formMin) +":"+ df.format(formSeg));
        }
    }
}
