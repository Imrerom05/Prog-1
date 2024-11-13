package Øving8;

public class Person {
    private final String fornavn;
    private final String etternavn;
    private final int fødselsår;

    public Person(String inFornavn, String inEtternavn, int inFødselsår) {
        fornavn = inFornavn;
        etternavn = inEtternavn;
        fødselsår = inFødselsår;

    }

    public String getFornavn() {
        return (fornavn);
    }

    public String getEtternavn() {
        return (etternavn);
    }

    public int getFødselsår() {
        return (fødselsår);
    }

}
