package Øving10;

import java.util.ArrayList;
import java.util.Scanner;

public class MenyRegister {
    ArrayList<Rett> retter = new ArrayList<Rett>();
    ArrayList<Meny> meny = new ArrayList<Meny>();
    Scanner input = new Scanner(System.in);

    public void nyRett(String navn, String type, double pris, String oppskrift) {
        retter.add(new Rett(navn, type, pris, oppskrift));
    }

    public Rett finnRett(String Navn) {
        for (int i = 0; i < retter.size(); i++) {
            if (retter.get(i).getNavn().equals(Navn)) {
                return (retter.get(i));
            }

        }
        return (null);

    }

    public ArrayList<Rett> finnRetterAvType(String type) {
        ArrayList<Rett> retur = new ArrayList<Rett>();

        for (int i = 0; i < retter.size(); i++) {
            if (retter.get(i).getType().equals(type)) {
                retur.add(retter.get(i));
            }

        }
        return (retur);

    }

    public void nyMeny() {
        ArrayList<Rett> nyMeny = new ArrayList<Rett>();
        System.out.println("0: fulfør meny");
        for (int i = 0; i < retter.size(); i++) {
            System.out.println(i + 1 + ": " + retter.get(i).getNavn());
        }
        int test = Integer.parseInt(input.nextLine());

        while (test != 0) {
            test--;
            nyMeny.add(retter.get(test));
            test = Integer.parseInt(input.nextLine());
        }

        meny.add(new Meny(nyMeny));
    }

    public ArrayList<Meny> menyerATB(double a, double b) {
        ArrayList<Meny> retur = new ArrayList<Meny>();
        for (int i = 0; i < meny.size(); i++) {
            if (meny.get(i).totPris() >= a && meny.get(i).totPris() <= b) {
                retur.add(meny.get(i));

            }

        }
        return (retur);
    }

}
