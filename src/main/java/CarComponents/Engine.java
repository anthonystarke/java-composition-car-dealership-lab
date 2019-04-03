package CarComponents;

public abstract class Engine implements IHorsepower {
    protected int horsepower;

    public Engine(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getHorsepower() {
        return this.horsepower;
    }
}
