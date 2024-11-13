package Øving11;

import java.util.ArrayList;
import java.util.Scanner;
import Øving10.Arangement;
import Øving10.MenyRegister;

public class Oppgave11 {

    public static void main(String[] args) {
        Eindomsregisteret register = new Eindomsregisteret();
        boolean test = true;
        Scanner input = new Scanner(System.in);
        register.newEindom(1445, "Gloppen", 77, 631, null, 1017.6, "Jens Olsen");
        register.newEindom(1445, "Gloppen", 77, 131, "Syningom", 661.3, "Nicolay Madsen");
        register.newEindom(1445, "Gloppen", 75, 19, "Fugletun", 650.6, "Evilyn Jensen");
        register.newEindom(1445, "Gloppen", 74, 188, null, 1457.2, "Karl Ove Bråten");
        register.newEindom(1445, "Gloppen", 69, 47, "Høiberg", 1339.4, "Elsa Indregård");

        while (test) {
            System.out.println(
                    "\nAvslutt: 0\nLegg til eindom: 1 \nFjern eindom med boligkode: 2\nTell eindomer: 3\nFinn eindom(kode): 4\nFinn snitt areal: 5\nFinn med gårdsnumer: 6");
            int test2 = Integer.parseInt(input.nextLine());

            if (test2 == 0) {
                test = false;
            }

            if (test2 == 1) {
                System.out.println("Komunenummer: ");
                int nummer = Integer.parseInt(input.nextLine());
                System.out.println("komuneNavn: ");
                String navn = input.nextLine();
                System.out.println("gårds nummer: ");
                int gårdsnummer = Integer.parseInt(input.nextLine());
                System.out.println("Bruksnumer: ");
                int bruksnummer = Integer.parseInt(input.nextLine());
                System.out.println("Bruksnavn: ");
                String bruksnavn = input.nextLine();
                System.out.println("Areal: ");
                double areal = Double.parseDouble(input.nextLine());
                System.out.println("Eier: ");
                String eier = input.nextLine();

                register.newEindom(nummer, navn, gårdsnummer, bruksnummer, bruksnavn, areal, eier);
            }

            if (test2 == 2) {
                System.out.println("Boligkode:");
                String boligkode = input.nextLine();
                register.fjernEindom(boligkode);
            }

            if (test2 == 3) {
                System.out.println(register.antEindomer());
            }

            if (test2 == 4) {
                System.out.println("Boligkode:");
                String boligkode = input.nextLine();
                System.out.println(register.finnEindom(boligkode));
            }

            if (test2 == 5) {
                System.out.println(register.snittArial());
            }

            if (test2 == 6) {
                System.out.println("Gårdsnumer:");
                int gårdNumer = Integer.parseInt(input.nextLine());
                ArrayList<Eindom> list = register.finnMedGårdsnummer(gårdNumer);
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));
                }
            }

        }

    }

}
