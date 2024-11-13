package Øving4;

public class Spiller {
    int poeng;
    int rundePoeng;
    int kast;
    String navn;
    boolean status = true;

    java.util.Random terning = new java.util.Random();

    public Spiller(String Navn) {
        navn = Navn;
    }

    public int getPoeng() {
        return (poeng);
    }

    public boolean status() {
        return (status);
    }

    public int kastTerning() {
        kast = terning.nextInt(6);
        kast += 1;
        System.out.println("Spiller " + navn + " kastet " + kast);
        rundePoeng += kast;
        if (kast == 1) {
            rundePoeng = 0;
        }
        return (kast);
    }

    public void erFerdig() {
        poeng += rundePoeng;
        rundePoeng = 0;
        status = false;
    }

    public void nyRunde() {
        rundePoeng = 0;
        status = true;
    }

}
