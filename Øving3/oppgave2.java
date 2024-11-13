package Øving3;

import java.util.Scanner;

public class oppgave2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Tast ett tall som er 1 eller savere for å avslute");
        System.out.println("Skriv et tall");
        String tallStr = input.nextLine();
        int tall = Integer.parseInt(tallStr);

        while (tall >= 0) {

            int test = 2;
            boolean resultat = false;
            while (tall > test) {
                if (tall % test == 0) {
                    resultat = true;
                }
                test += 1;

            }
            if (resultat) {
                System.out.println(tall + " er ikke et primtall");
            } else {
                System.out.println(tall + " er et primtall");
            }
            System.out.println("Skriv et tall");
            tallStr = input.nextLine();
            tall = Integer.parseInt(tallStr);

        }

    }

}
