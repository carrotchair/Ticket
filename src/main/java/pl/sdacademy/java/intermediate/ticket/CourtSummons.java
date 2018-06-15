package pl.sdacademy.java.intermediate.ticket;

public class CourtSummons implements Ticket {

    private final Ticket standTick2;

    public CourtSummons(Ticket standTick2) {
        this.standTick2 = standTick2;
    }

    private Person person;
    private String reason;

    public CourtSummons(Ticket standTick2, Person person, String reason) {
        this.standTick2 = standTick2;
        this.person = person;
        this.reason = reason;
    }

    @Override
    public void print() {
        System.out.println("----------- WEZWANIE DO SĄDU -----------");
        standTick2.print();
        System.out.println("Nie przyjął/ęła mandatu. Do zobaczenia w sądzie!");
        System.out.println("----------------------------------------");
        System.out.println();
    }
}
