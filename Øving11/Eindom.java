package Øving11;

public class Eindom {
    int kommunenummer;
    String kommunenavn;
    int gårdsnummer;
    int bruksnummer;
    String bruksnavn;
    double areal;
    String navn;

    public Eindom(int inKommunenummer, String inKommunenavn, int inGårdsnummer, int inBruksnummer, String inBruksnavn,
            double inAreal, String inNavn) {
        kommunenummer = inKommunenummer;
        kommunenavn = inKommunenavn;
        gårdsnummer = inGårdsnummer;
        bruksnummer = inBruksnummer;
        bruksnavn = inBruksnavn;
        areal = inAreal;
        navn = inNavn;
    }

    public String getBoligKode() {
        return (kommunenummer + "-" + gårdsnummer + "/" + bruksnummer);
    }

    public double getAreal() {
        return (areal);
    }

    public int getGårdsnumer() {
        return (gårdsnummer);
    }

    public String toString() {
        return ("Komuner: " + kommunenavn + "\nKode: " + kommunenummer + "-" + gårdsnummer + "/" + bruksnummer
                + "\nAreal: " + areal + "\nEier: " + navn);
    }

}
