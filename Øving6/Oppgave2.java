package Øving6;

public class Oppgave2 {
    int[] antallTegn = new int[30];
    String str;
    String vanligst;
    String[] abc = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
            "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "æ", "ø", "å" };
    boolean test = true;
    int antall;

    public Oppgave2(String tekst) {
        str = tekst;
        str = str.toLowerCase();
        for (int i = 0; i < tekst.length(); i++) {
            test = true;

            for (int j = 0; j < abc.length; j++) {
                if (str.charAt(i) == (abc[j]).charAt(0)) {
                    antallTegn[j] += 1;
                    test = false;
                }
            }
            if (test) {
                antallTegn[29] += 1;
            }
        }
    }

    public void antallBokstaver() {
        antall = 0;
        for (int i = 0; i < antallTegn.length - 1; i++) {
            antall += antallTegn[i];

        }
        System.out.println("Det er " + antall + " bokstaver i teksten");
    }

    public void forkjeligeBokstaver() {
        antall = 0;
        for (int i = 0; i < antallTegn.length - 1; i++) {
            if ((antallTegn[i] == 0) == false) {
                antall += 1;
            }

        }
        System.out.println("det er " + antall + " forkjelige bokstaver i teksten");

    }

    public void prosentTegn() {
        antall = 0;
        for (int i = 0; i < antallTegn.length; i++) {
            antall += antallTegn[i];

        }
        System.out.println(antallTegn[29] * 100 / antall + "% av teksten er ikke bokstaver");
        System.out.println(antallTegn[29]);
    }

    public void antall(String bokstav) {
        antall = 0;
        for (int i = 0; i < abc.length; i++) {
            if (bokstav == abc[i]) {
                antall += antallTegn[i];

            }
        }
        System.out.println("bokstaven " + bokstav + " var " + antall + " ganger i teksten");

    }

    public void oftest() {
        antall = 0;
        vanligst = "";
        for (int i = 0; i < antallTegn.length - 1; i++) {
            if (antallTegn[i] > antall) {
                antall = antallTegn[i];
            }

        }
        for (int j = 0; j < antallTegn.length - 1; j++) {
            if (antallTegn[j] == antall) {
                vanligst += ", " + abc[j];
            }

        }
        System.out.println("Den/de valigste bokstaven(e) i teksten er" + vanligst);
    }
}
