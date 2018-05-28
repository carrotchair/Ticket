package pl.sdacademy.java.intermediate.zoo;

class TeddyBear extends Bear {
    @Override
    public void eat() throws IDontEatException {
        throw new IDontEatException();
    }

    @Override
    public int getWeight() {
        return 1;
    }
}
