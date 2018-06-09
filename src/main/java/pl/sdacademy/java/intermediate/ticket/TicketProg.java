package pl.sdacademy.java.intermediate.ticket;

import java.util.Optional;

class TicketProg {
    public static void main(String[] args) {

        PersonRep personRep = new PersonRep();
        personRep.findByPesel(234234234L)
                .ifPresent(TicketProg::giveTicket);

        Optional<Person> byPesel = personRep.findByPesel(234234234L);
        if (byPesel.isPresent()) {
            Person person = byPesel.get();
        }

        //people.getPersonList().forEach(System.out::println);
    }

    private static void giveTicket(Person person) {
        TicketValue ticketValue = new StandTick(person, "Halasowal");
        ticketValue = new AdmonishTick(ticketValue);
        ticketValue.printTicket();
    }
}
