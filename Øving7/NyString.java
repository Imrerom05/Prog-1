package Øving7;

public class NyString {
    private final String str;

    public NyString(String Str) {
        str = Str;
    }

    public String forkort() {
        String tekst = new String();
        String[] ord = str.split(" ");
        for (int i = 0; i < ord.length; i++) {
            tekst += ord[i].charAt(0);
        }

        return (tekst);
    }

    public String fjernTegn(String tegn) {
        String tekst = new String();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != tegn.charAt(0)) {
                tekst += str.charAt(i);
            }
        }
        return (tekst);
    }

}
