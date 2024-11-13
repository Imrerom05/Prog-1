package Øving4;

import java.util.Scanner;

public class Oppgave2 {
    public static void main(String[] args) {
        Spiller a = new Spiller("A");
        Spiller b = new Spiller("B");
        boolean status = true;
        Scanner input = new Scanner(System.in);

        while (status) {

            if (a.status()) {
                if (a.kastTerning() == 1) {
                    a.erFerdig();
                } else {
                    System.out.println("Hvis du vil kaste igjen pres 1, hvis du vil avslute runden pres et anet tall");
                    double valg = Double.parseDouble(input.nextLine());
                    if (valg != 1) {
                        a.erFerdig();
                    }

                }

            }

            if (b.status()) {
                if (b.kastTerning() == 1) {
                    b.erFerdig();
                } else {
                    System.out.println("Hvis du vil kaste igjen pres 1, hvis du vil avslute runden pres et anet tall");
                    double valg = Double.parseDouble(input.nextLine());
                    if (valg != 1) {
                        b.erFerdig();
                    }

                }

            }

            if (a.status == false) {
                if (b.status == false) {
                    System.out.println("Spiller A har " + a.getPoeng() + " poeng");
                    System.out.println("Spiller B har " + b.getPoeng() + " poeng");
                    if (a.getPoeng() >= 100) {
                        System.out.println("Spiller A vant!");
                        status = false;
                    }
                    if (b.getPoeng() >= 100) {
                        System.out.println("Spiller B vant!");
                        status = false;
                    }
                    a.nyRunde();
                    b.nyRunde();

                }

            }

        }

    }
}
