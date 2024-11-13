package Øving5;

public class MinRandom {
    int tallint;
    double talldouble;
    java.util.Random tilfeldig = new java.util.Random();

    public int nesteHeltall(int nedre, int øvre) {
        tallint = tilfeldig.nextInt(øvre);
        while (nedre >= tallint) {
            tallint = tilfeldig.nextInt(øvre);
        }
        return (tallint);
    }

    public double nesteDesimaltall(double nedre, double øvre) {
        talldouble = tilfeldig.nextDouble();
        while (nedre >= talldouble || talldouble >= øvre) {
            talldouble = tilfeldig.nextDouble();
        }
        return (talldouble);

    }

}
