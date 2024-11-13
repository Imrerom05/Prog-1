package Øving5;

public class TestOp1 {
    public static void main(String[] args) {
        Oppgave1 B1 = new Oppgave1(1, 2);
        Oppgave1 B2 = new Oppgave1(2, 3);

        B1.plus(B2.getTeller(), B2.getNevner());
        B1.p();
        B1.minus(B2.getTeller(), B2.getNevner());
        B1.p();
        B1.forkorte();
        B1.p();
        B1.multipliser(B2.getTeller(), B2.getNevner());
        B1.forkorte();
        B1.p();
        B1.dividere(B2.getTeller(), B2.getNevner());
        B1.forkorte();
        B1.p();

    }

}
