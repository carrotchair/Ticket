package pl.sdacademy.java.intermediate.ticket;

import java.util.Optional;
import java.util.Scanner;

class TicketProg {
    public static void main(String[] args) {

        long readPesel;
        Scanner scanPerson = new Scanner(System.in);
        System.out.println("Podaj Pesel:");
        readPesel = scanPerson.nextInt();

        PersonRep personRep = new PersonRep();
        personRep.findByPesel(readPesel)
                .ifPresent(TicketProg::giveTicket);

        Optional<Person> byPesel = personRep.findByPesel(readPesel);
        if (byPesel.isPresent()) {
            Person person = byPesel.get();
        } else {
            System.out.println("Nie ma takiej wartości!");
        }
        //DO ĆWICZEŃ
        //Dostępne w bazie fake'owe numery pesel:
        //987987987, 456456456, 123123123, 234234234
    }

    private static void giveTicket(Person person) {

        String readReason;
        Scanner scanReason = new Scanner(System.in);
        System.out.println("Podaj powód wystawienia mandatu:");
        readReason = scanReason.next();

        Integer readLevel;
        Scanner scanLevel = new Scanner(System.in);
        System.out.println("Wybierz poziom mandatu od 1 do 5, gdzie:");
        System.out.println("*1 - 100zł, 2 punkty karne, mandat + pouczenie");
        System.out.println("*2 - 100zł, 4 punkty karne, mandat");
        System.out.println("*3 - 200zł, 6 punktów karnych, mandat");
        System.out.println("*4 - 500zł, 10 punktów karnych, mandat");
        System.out.println("*5 - 1000zł, 15 punktów karnych, mandat");
        readLevel = scanLevel.nextInt();

        if (readLevel == 1) {
            FineTicketType newLevel;
            newLevel = FineTicketType.LEVEL1;
            StandTick ticket = new StandTick.StandardTicketBuilder(person, readReason, newLevel).build();
            AdmonishTick admonishTick = new AdmonishTick(ticket);
            admonishTick.print();
        } else if (readLevel != 1) {
            Integer readCourt;
            Scanner ifCourt = new Scanner(System.in);
            System.out.println("Czy przyjął/ęła mandat? 1 - tak, 2 - nie");
            readCourt = ifCourt.nextInt();
            if (readCourt == 1) {
                System.out.println("-------------- MANDAT --------------");
                if (readLevel == 2) {
                    FineTicketType newLevel;
                    newLevel = FineTicketType.LEVEL2;
                    StandTick ticket2 = new StandTick.StandardTicketBuilder(person, readReason, newLevel).build();
                    ticket2.print();
                } else if (readLevel == 3) {
                    FineTicketType newLevel;
                    newLevel = FineTicketType.LEVEL3;
                    StandTick ticket2 = new StandTick.StandardTicketBuilder(person, readReason, newLevel).build();
                    ticket2.print();
                } else if (readLevel == 4) {
                    FineTicketType newLevel;
                    newLevel = FineTicketType.LEVEL4;
                    StandTick ticket2 = new StandTick.StandardTicketBuilder(person, readReason, newLevel).build();
                    ticket2.print();
                } else if (readLevel == 5) {
                    FineTicketType newLevel;
                    newLevel = FineTicketType.LEVEL5;
                    StandTick ticket2 = new StandTick.StandardTicketBuilder(person, readReason, newLevel).build();
                    ticket2.print();
                } else {
                    System.out.println("Nie ma takiej wartości!");
                }

            } if (readCourt == 2) {
                if (readLevel == 2) {
                    FineTicketType newLevel;
                    newLevel = FineTicketType.LEVEL2;
                    StandTick ticket2 = new StandTick.StandardTicketBuilder(person, readReason, newLevel).build();
                    CourtSummons courtSummons = new CourtSummons(ticket2);
                    courtSummons.print();
                } else if (readLevel == 3) {
                    FineTicketType newLevel;
                    newLevel = FineTicketType.LEVEL3;
                    StandTick ticket2 = new StandTick.StandardTicketBuilder(person, readReason, newLevel).build();
                    CourtSummons courtSummons = new CourtSummons(ticket2);
                    courtSummons.print();
                } else if (readLevel == 4) {
                    FineTicketType newLevel;
                    newLevel = FineTicketType.LEVEL4;
                    StandTick ticket2 = new StandTick.StandardTicketBuilder(person, readReason, newLevel).build();
                    CourtSummons courtSummons = new CourtSummons(ticket2);
                    courtSummons.print();
                } else if (readLevel == 5) {
                    FineTicketType newLevel;
                    newLevel = FineTicketType.LEVEL5;
                    StandTick ticket2 = new StandTick.StandardTicketBuilder(person, readReason, newLevel).build();
                    CourtSummons courtSummons = new CourtSummons(ticket2);
                    courtSummons.print();
                } else {
                    System.out.println("Nie ma takiej wartości!");
                }
            }
        }
        System.out.println("************ DRUKOWANIE ZAKOŃCZONE ************");
    }
}