public class oppgave2 {
    public static void main(String[] args) {
        int timer = 1;
        int minuter = 5;
        int sekunder = 37;

        minuter = minuter + timer * 60;
        sekunder = sekunder + minuter * 60;

        System.out.println(sekunder);

    }
}
