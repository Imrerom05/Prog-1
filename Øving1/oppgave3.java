import java.util.Scanner;

public class oppgave3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hvor mange sekunder? ");
        String sekunderStr = input.nextLine();
        int sekunder = Integer.parseInt(sekunderStr);
        int minuter = sekunder / 60;
        int sekunderNy = sekunder % 60;
        int timer = minuter / 60;
        int minuterNy = minuter % 60;

        System.out.println("det er " + timer + " timer");
        System.out.println("det er " + minuterNy + " minuter");
        System.out.println("det er " + sekunderNy + " sekunder");

    }
}