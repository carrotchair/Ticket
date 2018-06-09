package pl.sdacademy.java.intermediate.ticket;

public class CourtTick implements TicketValue {

    private Person person;
    private String reason;

    public CourtTick(Person person, String reason) {
        this.person = person;
        this.reason = reason;
    }

    @Override
    public void printTicket() {
        System.out.println(person);
        System.out.println("dostał/ła ticket za:");
        System.out.println(reason);
        System.out.println("Do zobaczenia w sądzie!");
    }
}
