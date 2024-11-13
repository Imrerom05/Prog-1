package Øving6;

public class Oppgave1 {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();
        int tall;
        int[] liste = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        for (int i = 0; i < 10000; i++) {
            tall = random.nextInt(10);
            liste[tall] += 1;
        }
        for (int j = 0; j < liste.length; j++) {
            System.out.println(j + ": " + liste[j]);

        }

    }
}
