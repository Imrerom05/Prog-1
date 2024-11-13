package Øving9;

import java.util.ArrayList;

public class Oppgaveoversikt {
    ArrayList<Student> studenter = new ArrayList<Student>();
    private int antStud;

    public int getAntStud() {
        return (antStud);
    }

    public int antOppStud(String studNavn) {
        for (int i = 0; i < antStud; i++) {
            if (studenter.get(i).getNavn().equals(studNavn)) {
                return (studenter.get(i).getAntOppg());
            }
        }
        return 0;
    }

    public void nyStud(Student ny) {
        studenter.add(ny);
        antStud++;
    }

    public void økAntOppStud(String studNavn, int økning) {
        for (int i = 0; i < antStud; i++) {
            if (studenter.get(i).getNavn().equals(studNavn)) {
                studenter.get(i).økAntOppg(økning);
            }
        }
    }

    public String toString() {
        String retur = new String();
        retur += "Det er " + antStud + " studenter registret\n\nHer er de:\n";
        for (int i = 0; i < antStud; i++) {
            retur += "Navn: " + studenter.get(i).getNavn() + "\nOppgaver løst: " + studenter.get(i).getAntOppg() + "\n";

        }
        return (retur);
    }

}
