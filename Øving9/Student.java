package Øving9;

public class Student {
    private String navn;
    private int antOppg;

    public Student(String inNavn, int inAntOppg) {
        navn = inNavn;
        antOppg = inAntOppg;
    }

    public String getNavn() {
        return (navn);

    }

    public int getAntOppg() {
        return (antOppg);

    }

    public void økAntOppg(int økning) {
        antOppg += økning;

    }

    public String toString() {
        return (navn + ", " + antOppg);

    }

}
