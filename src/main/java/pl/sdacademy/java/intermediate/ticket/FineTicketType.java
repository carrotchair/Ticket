package pl.sdacademy.java.intermediate.ticket;

public enum FineTicketType {

    LEVEL1(100L, 2), //mandat + pouczenie
    LEVEL2(100L, 4), //mandat, ifCourt
    LEVEL3(200L, 6), //mandat, ifCourt
    LEVEL4(500L, 10), //mandat, ifCourt
    LEVEL5(1000L, 15); //mandat, ifCourt

    private final Long price;
    private final Integer points;

    FineTicketType(Long price, Integer points) {
        this.price = price;
        this.points = points;
    }

    public Long getPrice() {
        return  price;
    }

    public Integer getPoints() {
        return  points;
    }

    public void print() {
        System.out.println("Mandat o wysokości: " + price + " + punkty karne: " + points);
    }
}
