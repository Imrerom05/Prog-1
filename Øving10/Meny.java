package Øving10;

import java.util.ArrayList;

public class Meny {
    ArrayList<Rett> meny;

    public Meny(ArrayList<Rett> inMeny) {
        meny = inMeny;
    }

    public double totPris() {
        double totPris = 0;
        for (int i = 0; i < meny.size(); i++) {
            totPris += meny.get(i).getPris();

        }
        return (totPris);

    }

    public void str() {
        System.out.println("Meny:");
        for (int i = 0; i < meny.size(); i++) {

            meny.get(i).str();

        }
        System.out.println();
    }

}
