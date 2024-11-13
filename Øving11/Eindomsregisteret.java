package Øving11;

import java.util.ArrayList;

public class Eindomsregisteret {

    ArrayList<Eindom> eindomer = new ArrayList<Eindom>();

    public void newEindom(int kommunenummer, String kommunenavn, int gårdsnummer, int bruksnummer, String bruksnavn,
            double areal, String navn) {
        eindomer.add(new Eindom(kommunenummer, kommunenavn, gårdsnummer, bruksnummer, bruksnavn, areal, navn));
    }

    public void fjernEindom(String boligKode) {
        for (int i = 0; i < eindomer.size(); i++) {
            if (eindomer.get(i).getBoligKode().equals(boligKode)) {
                eindomer.remove(i);
                break;
            }

        }
    }

    public int antEindomer() {
        return (eindomer.size());
    }

    public Eindom finnEindom(String boligKode) {
        for (int i = 0; i < eindomer.size(); i++) {
            if (eindomer.get(i).getBoligKode().equals(boligKode)) {
                return (eindomer.get(i));
            }
        }
        return (null);
    }

    public double snittArial() {
        double totAreal = 0;
        for (int i = 0; i < eindomer.size(); i++) {
            totAreal += eindomer.get(i).getAreal();
        }
        return (totAreal / eindomer.size());
    }

    public ArrayList<Eindom> finnMedGårdsnummer(int gårdsnummer) {
        ArrayList<Eindom> retur = new ArrayList<Eindom>();
        for (int i = 0; i < eindomer.size(); i++) {
            if (eindomer.get(i).getGårdsnumer() == gårdsnummer) {
                retur.add(eindomer.get(i));
            }
        }
        return (retur);

    }
}
