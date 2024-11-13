package Øving7;

public class Opp2test {
    public static void main(String[] args) {
        Oppgave2 tekst = new Oppgave2(
                "Hei, mit navn er imre. jeg er 19 år! lever i trondheim: i år skal jeg studer dattateknelogi på Ntnu");

        System.out.println(tekst.antallOrd());
        System.out.println(tekst.ordLengde());
        System.out.println(tekst.ordPerPeriode());
        System.out.println(tekst.hentTekst());
        tekst.bytut("jeg", "du");
        System.out.println(tekst.hentTekstStorebokstaver());
    }

}
