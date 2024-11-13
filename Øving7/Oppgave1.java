package Øving7;

public class Oppgave1 {
    public static void main(String[] args) {
        NyString string = new NyString("kvak, hei, jeg hetter Imre!");
        System.out.println(string.forkort());
        System.out.println(string.fjernTegn("e"));
    }

}
