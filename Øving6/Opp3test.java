package Øving6;

public class Opp3test {
    public static void main(String[] args) {
        int[][] mat = { { 2, 3 }, { 4, -2 } };
        int[][] mat1 = { { 2, 0 }, { 2, 2 } };

        Oppgave3 matrise = new Oppgave3(mat);
        matrise.aderre(mat1).p();
        matrise.transponer().p();
        matrise.multiplisere(mat1).p();

    }

}
