package pl.sdacademy.java.intermediate.ticket;

public class AdmonishTick implements TicketValue {
    private final TicketValue standTick;

    public AdmonishTick(TicketValue standTick) {
        this.standTick = standTick;
    }

    @Override
    public void printTicket() {
        System.out.println("pouczenie");
        standTick.printTicket();
        System.out.println("oki doki");
    }
}
