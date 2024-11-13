package Øving2;

import java.util.Scanner;

;

public class oppgave1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hvilket år lurer du på om er et skudår");
        String årStr = input.nextLine();
        int år = Integer.parseInt(årStr);
        if (år % 400 == 0) {
            System.out.println("år " + år + " er et skudår!");
        } else {
            if (år % 100 != 0) {
                if (år % 4 == 0) {
                    System.out.println("år " + år + " er et skudår!");

                } else {
                    System.out.println("år " + år + " er ikke et skudår!");
                }

            } else {
                System.out.println("år " + år + " er ikke et skudår!");

            }

        }
    }
}
