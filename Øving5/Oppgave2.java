package Øving5;

public class Oppgave2 {
    public static void main(String[] args) {
        MinRandom test = new MinRandom();
        for (int i = 0; i < 10; i++) {
            System.out.println("Helltaer er: " + test.nesteHeltall(5, 15));
            System.out.println("Desimaltalet er: " + test.nesteDesimaltall(0.2, 0.85));
        }

    }

}
