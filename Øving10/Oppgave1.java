package Øving10;

import java.util.ArrayList;
import java.util.Scanner;

import Øving9.Oppgaveoversikt;

public class Oppgave1 {
    public static void main(String[] args) {
        boolean test = true;
        Scanner input = new Scanner(System.in);
        Arangementregister register = new Arangementregister();

        while (test) {
            System.out.println(
                    "\nAvslutt: 0\nLegg til arangemet: 1 \nFinn arengemager på et hvist sted: 2\nFinn arangemanger på tid: 3\nArangemenger melom tid a og tid b: 4\nSorter etter sted: 5\nSorter etter type: 6\nSorter etter dato: 7");
            int test2 = Integer.parseInt(input.nextLine());

            if (test2 == 0) {
                test = false;
            }

            if (test2 == 1) {
                System.out.println("Nummer: ");
                int nummer = Integer.parseInt(input.nextLine());
                System.out.println("Navn: ");
                String navn = input.nextLine();
                System.out.println("Sted: ");
                String sted = input.nextLine();
                System.out.println("Arangør: ");
                String arangør = input.nextLine();
                System.out.println("Type: ");
                String type = input.nextLine();
                System.out.println("tidspunkt årmåneddagtid: ");
                long tidspunkt = Long.parseLong(input.nextLine());

                register.nyttArangement(nummer, navn, sted, arangør, type, tidspunkt);
            }

            if (test2 == 2) {
                System.out.println("Hvilket sted");
                String sted = input.nextLine();
                ArrayList<Arangement> list = register.finnAragementSted(sted);
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i).getNavn());
                }
            }

            if (test2 == 3) {
                System.out.println("Hvilket dato, skriv på tiktig foramt");
                long dato = Long.parseLong(input.nextLine());
                ArrayList<Arangement> list = register.finnAragementDato(dato);
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i).getNavn());
                }
            }

            if (test2 == 4) {
                System.out.println("Tid A");
                long tidA = Long.parseLong(input.nextLine());
                System.out.println("Tid B");
                long tidB = Long.parseLong(input.nextLine());
                ArrayList<Arangement> list = register.finnAragementFraDatoTilDato(tidA, tidB);
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i).getNavn());
                }
            }

            if (test2 == 5) {
                ArrayList<Arangement> list = register.sortBySted();
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i).getSted() + ": " + list.get(i).getNavn());
                }
            }

            if (test2 == 6) {
                ArrayList<Arangement> list = register.sortByType();
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i).getType() + ": " + list.get(i).getNavn());
                }
            }

            if (test2 == 7) {
                ArrayList<Arangement> list = register.sortByTid();
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i).getDato() + ": " + list.get(i).getNavn());
                }
            }

        }

    }

}
