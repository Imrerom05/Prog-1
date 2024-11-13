package Øving3;

import java.util.Scanner;

public class oppgave1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vi skal skrive ut gangetabelen for alle talene melom to tall");
        System.out.println("Skriv tall 1");
        double tall1 = Double.parseDouble(input.nextLine());
        System.out.println("Skriv tall 2");
        double tall2 = Double.parseDouble(input.nextLine());

        if (tall1 <= tall2) {
            while (tall1 <= tall2) {
                double t = 1;
                while (10 >= t) {
                    System.out.println(tall1 + "*" + t + "=" + tall1 * t);
                    t += 1;
                }
                tall1 += 1;

            }

        } else {
            while (tall2 <= tall1) {
                double t = 1;
                while (10 >= t) {
                    System.out.println(tall2 + "*" + t + "=" + tall2 * t);
                    t += 1;
                }
                tall2 += 1;
            }
        }
    }
}
