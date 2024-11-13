package Øving5;

public class Oppgave1 {
    int teller;
    int nevner;

    public Oppgave1(int Teller, int Nevner) {
        teller = Teller;
        nevner = Nevner;
        if (nevner == 0) {
            throw new IllegalArgumentException("Nevner must be greater than zero");
        }

    }

    public Oppgave1(int Teller) {
        teller = Teller;
        nevner = 1;
    }

    public int getTeller() {
        return (teller);
    }

    public int getNevner() {
        return (nevner);

    }

    public void multipliser(int Teller, int Nevner) {
        teller = teller * Teller;
        nevner = nevner * Nevner;
    }

    public void dividere(int Teller, int Nevner) {
        teller = teller * Nevner;
        nevner = nevner * Teller;
    }

    public void minus(int Teller, int Nevner) {
        teller = teller * Nevner - Teller * nevner;
        nevner = nevner * Nevner;
    }

    public void plus(int Teller, int Nevner) {
        teller = Teller * nevner + teller * Nevner;
        nevner = nevner * Nevner;
    }

    public void forkorte() {
        while ((teller % 2 == 0 && nevner % 2 == 0) || (teller % 3 == 0 && nevner % 3 == 0) ||
                (teller % 5 == 0 && nevner % 5 == 0) || (teller % 7 == 0 && nevner % 7 == 0)) {
            if (teller % 2 == 0 && nevner % 2 == 0) {
                teller /= 2;
                nevner /= 2;
            }
            if (teller % 3 == 0 && nevner % 3 == 0) {
                teller /= 3;
                nevner /= 3;
            }
            if (teller % 5 == 0 && nevner % 5 == 0) {
                teller /= 5;
                nevner /= 5;
            }
            if (teller % 7 == 0 && nevner % 7 == 0) {
                teller /= 7;
                nevner /= 7;
            }

        }
    }

    public void p() {
        System.out.println(teller + "/" + nevner);
    }

}
