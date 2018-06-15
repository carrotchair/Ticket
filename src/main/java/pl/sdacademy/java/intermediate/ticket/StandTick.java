package pl.sdacademy.java.intermediate.ticket;

public class StandTick implements Ticket {

    private Person person;
    private String reason;
    FineTicketType fineTicketType;
    String city;

    private StandTick(StandardTicketBuilder builder) {
        this.person = builder.getPerson();
        this.reason = builder.getReason();
        this.fineTicketType = builder.getFineTicketType();
        this.city = builder.getCity();
    }

    @Override
    public void print() {
        System.out.println("----------------------------------------");
        System.out.println(person);
        System.out.println("Mandat wypisany za:");
        System.out.println(reason);
        fineTicketType.print();
        System.out.println("----------------------------------------");
    }

    public static class StandardTicketBuilder {
        private Person person;
        private String reason;
        private FineTicketType fineTicketType;
        private String city;

        public Person getPerson() {
            return person;
        }

        public String getReason() {
            return reason;
        }

        public FineTicketType getFineTicketType() {
            return fineTicketType;
        }

        public String getCity() {
            return city;
        }

        public StandardTicketBuilder(Person person, String reason, FineTicketType fineTicketType) {
            this.person = person;
            this.reason = reason;
            this.fineTicketType = fineTicketType;
        }

        public StandTick build() {
            return new StandTick(this);
        }


    }
}
