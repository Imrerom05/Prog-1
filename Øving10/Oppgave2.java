package Øving10;

public class Oppgave2 {
    public static void main(String[] args) {
        MenyRegister register = new MenyRegister();

        register.nyRett("Taco", "Hovedret", 89, "bla,bla");
        register.nyRett("Salat", "Forrett", 39, "bla,bla");
        register.nyRett("Is", "Hovedret", 49, "bla,bla");
        register.nyRett("Spageti", "Hovedret", 129, "bla,bla");

        register.finnRett("Taco").str();

        for (int i = 0; i < register.finnRetterAvType("Hovedret").size(); i++) {
            register.finnRetterAvType("Hovedret").get(i).str();
        }

        register.nyMeny();
        register.nyMeny();

        for (int i = 0; i < register.menyerATB(100, 150).size(); i++) {
            register.menyerATB(100, 150).get(i).str();
        }

    }

}
