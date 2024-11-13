package Øving10;

public class Arangement {
    int nummer;
    String navn;
    String sted;
    String arrangør;
    String type;
    long tidspunkt;

    public Arangement(int inNummer, String inNavn, String inSted, String inArrangør, String inType, long inTidspunkt) {
        nummer = inNummer;
        navn = inNavn;
        sted = inSted;
        arrangør = inArrangør;
        type = inType;
        tidspunkt = inTidspunkt;
    }

    public String getSted() {
        return (sted);
    }

    public String getNavn() {
        return (navn);
    }

    public long getDato() {
        return (tidspunkt);
    }

    public String getType() {
        return (type);
    }

}

// For hvert arrangement lagrer vi et entydig nummer, navn, sted, arrangør, type
// (konsert, barneteater, foredrag osv)
// og tidspunkt (dato og klokkeslett). Lagre tidspunktene som heltall, eksempel:
// 200210301800 ;
