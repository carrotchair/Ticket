package pl.sdacademy.java.intermediate.ticket;

public enum FineTicketType {

    LEVEL1(100L, 2),
    LEVEL2(100L, 4),
    LEVEL3(200L, 6),
    LEVEL4(500L, 10),
    LEVEL5(1000L, 15);

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
}
