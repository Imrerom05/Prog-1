package Øving10;

import java.util.ArrayList;
import java.util.Collections;

public class Arangementregister {

    ArrayList<Arangement> arangementer = new ArrayList<Arangement>();

    public void nyttArangement(int inNummer, String inNavn, String inSted, String inArrangør, String inType,
            long inTidspunkt) {
        arangementer.add(new Arangement(inNummer, inNavn, inSted, inArrangør, inType, inTidspunkt));
    }

    public ArrayList<Arangement> finnAragementSted(String sted) {
        ArrayList<Arangement> retur = new ArrayList<Arangement>();

        for (int i = 0; i < arangementer.size(); i++) {
            if (arangementer.get(i).getSted().equals(sted)) {
                retur.add(arangementer.get(i));
            }

        }
        return (retur);
    }

    public ArrayList<Arangement> finnAragementDato(long dato) {
        ArrayList<Arangement> retur = new ArrayList<Arangement>();

        for (int i = 0; i < arangementer.size(); i++) {
            if (arangementer.get(i).getDato() / 10000 == dato / 10000) {
                retur.add(arangementer.get(i));
            }

        }
        return (retur);
    }

    public ArrayList<Arangement> finnAragementFraDatoTilDato(long dato1, long dato2) {
        ArrayList<Arangement> retur = new ArrayList<Arangement>();

        for (int i = 0; i < arangementer.size(); i++) {
            for (long j = dato1; j < dato2; j++) {
                if (arangementer.get(i).getDato() == j) {
                    retur.add(arangementer.get(i));
                }

            }

        }
        return (retur);
    }

    public ArrayList<Arangement> sortBySted() {
        ArrayList<String> sortHelp = new ArrayList<String>();
        ArrayList<Arangement> retur = new ArrayList<Arangement>();
        for (int i = 0; i < arangementer.size(); i++) {
            sortHelp.add(arangementer.get(i).getSted());
        }
        Collections.sort(sortHelp);
        for (int i = 0; i < sortHelp.size(); i++) {
            for (int j = 0; j < arangementer.size(); j++) {
                if (arangementer.get(j).getSted().equals(sortHelp.get(i))) {
                    retur.add(arangementer.get(j));
                }
            }
        }
        return (retur);
    }

    public ArrayList<Arangement> sortByType() {
        ArrayList<String> sortHelp = new ArrayList<String>();
        ArrayList<Arangement> retur = new ArrayList<Arangement>();
        for (int i = 0; i < arangementer.size(); i++) {
            sortHelp.add(arangementer.get(i).getType());
        }
        Collections.sort(sortHelp);
        for (int i = 0; i < sortHelp.size(); i++) {
            for (int j = 0; j < arangementer.size(); j++) {
                if (arangementer.get(j).getType().equals(sortHelp.get(i))) {
                    retur.add(arangementer.get(j));
                }
            }
        }
        return (retur);
    }

    public ArrayList<Arangement> sortByTid() {
        ArrayList<Long> sortHelp = new ArrayList<Long>();
        ArrayList<Arangement> retur = new ArrayList<Arangement>();
        for (int i = 0; i < arangementer.size(); i++) {
            sortHelp.add(arangementer.get(i).getDato());
        }
        Collections.sort(sortHelp);
        for (int i = 0; i < sortHelp.size(); i++) {
            for (int j = 0; j < arangementer.size(); j++) {
                if (arangementer.get(j).getDato() == (sortHelp.get(i))) {
                    retur.add(arangementer.get(j));
                }
            }
        }
        return (retur);
    }
}