package Øving8;

import java.util.Scanner;

public class Oppgave1 {
  public static void main(String[] args) {
    java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
    int år = kalender.get(java.util.Calendar.YEAR);
    boolean test = true;
    Scanner input = new Scanner(System.in);

    ArbTaker Hans = new ArbTaker(new Person("Hans", "Romstad", 2000), 125, 2020, 50000, 0.35, år);

    System.out.println(Hans.getArbtakernr());
    System.out.println(Hans.getAnsettelsesår());
    System.out.println(Hans.getMånedslønn());
    System.out.println(Hans.getSkatteprosent());
    System.out.println(Hans.getPersonalia().getFødselsår());
    System.out.println(Hans.brutolønn());
    System.out.println(Hans.skattMåned());
    System.out.println(Hans.skatteTrekkÅr());
    System.out.println(Hans.navn());
    System.out.println(Hans.alder());
    System.out.println(Hans.årIBerdift());
    System.out.println(Hans.ansattMerEn(3));

    while (test) {
      System.out.println("\nVelg 1 \nNy Månedslønn: 1 \nNy Skatteprosent: 2\nAvslut: 3");
      int test2 = Integer.parseInt(input.nextLine());

      if (test2 == 1) {
        System.err.println("\nSkriv in den nye månedslønen");
        double nyLønn = Double.parseDouble(input.nextLine());
        Hans.setMånedslønn(nyLønn);
        System.out.println("Månedslønen er satt til " + Hans.getMånedslønn() + " kr");
        System.out.println("Den nye bruotolønen er " + Hans.brutolønn() + " kr");
        System.out.println("Nytt skatetrekk per år er " + Hans.skatteTrekkÅr() + " kr");
        System.out.println("Nytt skatetrekk per måned er " + Hans.skattMåned() + " kr");
      }

      if (test2 == 2) {
        System.err.println("\nSkriv in den nye skatteprosenten(skal skrives som desimaltall)");
        double nySkatt = Double.parseDouble(input.nextLine());
        Hans.setSkatteprosent(nySkatt);
        System.out.println("\nSkateprosenten er satt til " + Hans.getSkatteprosent() * 100 + "%");
        System.out.println("Den nye bruotolønen er " + Hans.brutolønn() + " kr");
        System.out.println("Nytt skatetrekk per år er " + Hans.skatteTrekkÅr() + " kr");
        System.out.println("Nytt skatetrekk per måned er " + Hans.skattMåned() + " kr");
      }

      if (test2 == 3) {
        test = false;
      }
    }
  }
}
