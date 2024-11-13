package Øving2;

import java.util.Scanner;

;

public class oppgave2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hvor mye veier det i gram?");
        double g = Double.parseDouble(input.nextLine());

        System.out.println("Hvor mye koster det?");
        double kr = Double.parseDouble(input.nextLine());

        double pris = (kr / g) * 1000;

        System.out.println("det koster " + pris + " kr per kg");

    }
}
