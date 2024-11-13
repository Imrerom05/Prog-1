package Øving6;

public class Oppgave3 {
    final private int[][] matrise;

    public Oppgave3(int[][] mat) {
        matrise = mat;
    }

    public Oppgave3 aderre(int[][] mat) {
        int[][] nyMatrise = new int[matrise.length][matrise[0].length];
        if (matrise.length == mat.length && matrise[0].length == mat[0].length) {
            for (int i = 0; i < matrise.length; i++) {
                for (int j = 0; j < matrise[0].length; j++) {
                    nyMatrise[i][j] += matrise[i][j] + mat[i][j];

                }

            }
            return (new Oppgave3(nyMatrise));
        } else {
            return null;
        }

    }

    public Oppgave3 multiplisere(int[][] mat) {
        int[][] nyMatrise = new int[matrise.length][mat[0].length];
        if (matrise[0].length == mat.length) {
            for (int i = 0; i < matrise.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    for (int k = 0; k < matrise[0].length; k++) {
                        nyMatrise[i][j] += matrise[i][k] * mat[k][i];
                    }

                }

            }
            return (new Oppgave3(nyMatrise));
        } else {
            return null;
        }

    }

    public Oppgave3 transponer() {

        int[][] nyMatrise = new int[matrise[0].length][matrise.length];

        for (int i = 0; i < matrise[0].length; i++) {
            for (int j = 0; j < matrise.length; j++) {
                nyMatrise[i][j] = matrise[j][i];

            }

        }
        return (new Oppgave3(nyMatrise));

    }

    public void p() {
        for (int i = 0; i < matrise.length; i++) {
            System.out.println();
            for (int j = 0; j < matrise.length; j++) {
                System.out.print(matrise[i][j] + ", ");

            }

        }
    }

}
