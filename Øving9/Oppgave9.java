package Øving9;

import java.util.Scanner;

public class Oppgave9 {
    public static void main(String[] args) {
        Oppgaveoversikt ntnu = new Oppgaveoversikt();
        boolean test = true;
        Scanner input = new Scanner(System.in);
        String stud;
        int antall;
        ntnu.nyStud(new Student("Imre", 13));

        while (test) {
            System.out.println(
                    "\nSe Oppgaveoversikt: 1 \nAntall studenter: 2\nFinn hvor mange oppaver student .... har gjort: 3\nRegistrer ny student: 4\nGodkjen oppgave/r: 5\nAvslutt: 6");
            int test2 = Integer.parseInt(input.nextLine());

            if (test2 == 1) {
                System.out.println(ntnu.toString());
            }

            if (test2 == 2) {
                System.out.println("Det er " + ntnu.getAntStud() + " studenter registrert");
            }

            if (test2 == 3) {
                System.out.println("Hvilken student vil du sjekke?");
                stud = input.nextLine();
                System.out.println(stud + " har gjort " + ntnu.antOppStud(stud) + " oppgaver");
            }

            if (test2 == 4) {
                System.out.println("Hva hetter studenten?");
                stud = input.nextLine();
                System.out.println("Hvor mange oppgaver har " + stud + " løst");
                antall = Integer.parseInt(input.nextLine());

                ntnu.nyStud(new Student(stud, antall));

            }

            if (test2 == 5) {
                System.out.println(
                        "Hva hetter studenten du skal godkjen oppgaver for(husk stor bokstav hvis han er registrert med det)");
                stud = input.nextLine();
                System.out.println("Hvor mange flere oppgaver har " + stud + " løst");
                antall = Integer.parseInt(input.nextLine());

                ntnu.økAntOppStud(stud, antall);
            }

            if (test2 == 6) {
                test = false;
            }

        }

    }

}
