package pl.sdacademy.java.intermediate.ticket;

public class AdmonishTick implements Ticket {

    private final Ticket standTick;

    public AdmonishTick(Ticket standTick) {
        this.standTick = standTick;
    }

    @Override
    public void print() {
        System.out.println("-------------- POUCZENIE ---------------");
        standTick.print();
        System.out.println("Miłego dnia!");
        System.out.println();
    }
}
