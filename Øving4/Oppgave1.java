package Øving4;

import java.util.Scanner;

public class Oppgave1 {
    public static void main(String[] args) {
        Valuta euro = new Valuta(10);
        Valuta dollar = new Valuta(11);
        Valuta svenskeKr = new Valuta(0.90);
        Scanner input = new Scanner(System.in);

        System.out.println("Velg valuta du vil veksle med\n 1: Euro\n 2: Dollar\n 3: Svenskekroner\n 4: Avslutt \n");
        double valg = Double.parseDouble(input.nextLine());

        while (valg != 4) {
            if (valg == 1) {
                System.out.println("Hvor mange euro har du?");
                double salado = Double.parseDouble(input.nextLine());
                System.out.println("Du har " + euro.tilKr(salado) + " kr");
            }

            if (valg == 2) {
                System.out.println("Hvor mange dollar har du?");
                double salado = Double.parseDouble(input.nextLine());
                System.out.println("Du har " + dollar.tilKr(salado) + " kr");
            }

            if (valg == 3) {
                System.out.println("Hvor mange svenskekroner har du?");
                double salado = Double.parseDouble(input.nextLine());
                System.out.println("Du har " + svenskeKr.tilKr(salado) + " kr");
            }

            System.out
                    .println("Velg valuta du vil veksle med\n 1: Euro\n 2: Dollar\n 3: Svenskekroner\n 4: Avslutt \n");
            valg = Double.parseDouble(input.nextLine());
        }

    }

}
