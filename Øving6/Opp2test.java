package Øving6;

import java.util.Scanner;

public class Opp2test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv stop for å avslute");
        String str = input.nextLine();
        Oppgave2 tekst = new Oppgave2(str);
        while ((str == "stop") == false) {
            tekst.antall("e");
            tekst.antallBokstaver();
            tekst.forkjeligeBokstaver();
            tekst.prosentTegn();
            tekst.oftest();
            str = input.nextLine();
            tekst = new Oppgave2(str);
        }

    }

}
