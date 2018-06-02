package pl.sdacademy.java.intermediate.zoo;

public abstract class Bear extends Animal {
    private int hp;
    public Bear() {
        super();
        hp = 100;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public boolean isAlive() {
        return super.isAlive() && hp > 0;
    }

}
