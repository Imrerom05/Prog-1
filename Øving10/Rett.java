package Øving10;

public class Rett {
    String navn;
    String type;
    double pris;
    String oppskrift;

    public Rett(String inNavn, String inType, double inPris, String inOppskrift) {
        navn = inNavn;
        type = inType;
        pris = inPris;
        oppskrift = inOppskrift;
    }

    public String getNavn() {
        return (navn);
    }

    public double getPris() {
        return (pris);
    }

    public String getType() {
        return (type);
    }

    public void str() {
        System.out.println(navn + ", " + type + ", " + pris + " kr");
    }

}
