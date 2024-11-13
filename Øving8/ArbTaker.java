package Øving8;

public class ArbTaker {
    Person personalia;
    int arbtakernr;
    int ansettelsesår;
    double månedslønn;
    double skatteprosent;
    int årstall;

    public ArbTaker(Person p1, int abNr, int aÅr, double mLønn, double sProsent, int årT) {
        personalia = p1;
        arbtakernr = abNr;
        ansettelsesår = aÅr;
        månedslønn = mLønn;
        skatteprosent = sProsent;
        årstall = årT;

    }

    public Person getPersonalia() {
        return (personalia);
    }

    public int getArbtakernr() {
        return (arbtakernr);
    }

    public int getAnsettelsesår() {
        return (ansettelsesår);
    }

    public double getMånedslønn() {
        return (månedslønn);
    }

    public double getSkatteprosent() {
        return (skatteprosent);

    }

    public void setMånedslønn(double nyMånedslønn) {
        månedslønn = nyMånedslønn;
    }

    public void setSkatteprosent(double nySkatteprosent) {
        skatteprosent = nySkatteprosent;
    }

    public double skattMåned() {
        return (skatteprosent * månedslønn);

    }

    public double brutolønn() {
        return ((månedslønn - (skatteprosent * månedslønn)) * 12);

    }

    public double skatteTrekkÅr() {
        return ((skatteprosent * månedslønn) * 10.5);
    }

    public String navn() {
        return (personalia.getEtternavn() + ", " + personalia.getFødselsår());
    }

    public int alder() {
        return (årstall - personalia.getFødselsår());
    }

    public int årIBerdift() {
        return (årstall - ansettelsesår);
    }

    public boolean ansattMerEn(int år) {
        return (år < (årstall - ansettelsesår));
    }

}
