package pl.sdacademy.java.intermediate.ticket;

public class StandTick implements TicketValue {

    private Person person;
    private String reason;

    public StandTick(Person person, String reason) {
        this.person = person;
        this.reason = reason;
    }

    @Override
    public void printTicket() {
        System.out.println(person);
        System.out.println("dostał/ła mandat za:");
        System.out.println(reason);
    }
}
