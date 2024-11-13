package Øving7;

public class Oppgave2 {
    String tekst;

    public Oppgave2(String tek) {
        tekst = tek;
    }

    public int antallOrd() {
        String[] ord = tekst.split(" ");
        int retInt = 0;
        for (int i = 0; i < ord.length; i++) {
            retInt++;
        }
        return (retInt);

    }

    public double ordLengde() {
        String[] ord = tekst.split(" ");
        double antall_bokstaver = 0;
        double antall_ord = 0;

        for (int i = 0; i < ord.length; i++) {
            antall_ord++;
            for (int j = 0; j < ord[i].length(); j++) {
                antall_bokstaver++;
            }

        }
        return (antall_bokstaver / antall_ord);

    }

    public double ordPerPeriode() {
        String[] setninger = tekst.split("[:\\.!\\?]+");
        String[] ord;
        double antallSetninger = 0;
        double antallord = 0;
        for (int i = 0; i < setninger.length; i++) {
            antallSetninger++;
            ord = setninger[i].split(" ");
            for (int j = 0; j < ord.length; j++) {
                antallord++;
            }
        }
        return (antallord / antallSetninger);

    }

    public void bytut(String fjernOrd, String nyttOrd) {
        String[] ord = tekst.split(" ");
        for (int i = 0; i < ord.length; i++) {
            if (ord[i].equals(fjernOrd)) {
                ord[i] = nyttOrd;
            }
        }
        tekst = "";
        for (int i = 0; i < ord.length; i++) {
            tekst += ord[i] + " ";
        }
    }

    public String hentTekst() {
        return (tekst);
    }

    public String hentTekstStorebokstaver() {
        String retur = new String();
        retur = tekst.toUpperCase();
        return (retur);
    }

}
