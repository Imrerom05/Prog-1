package Øving4;

public class Valuta {
    double kursKr;

    public Valuta(double kursKrIn) {
        kursKr = kursKrIn;

    }

    public double fraKr(double kr) {
        return kr / kursKr;

    }

    public double tilKr(double kr) {
        return kr * kursKr;

    }

}
