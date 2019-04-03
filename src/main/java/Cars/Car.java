package Cars;

import CarComponents.*;

public abstract class Car implements ICar {

    int price;
    boolean isACar;
    String colour;
    Engine engine;
    Tyres tyres;
    Seats seats;
    Body body;

    Car(int price, String colour, Engine engine, Tyres tyres, Seats seats, Body body) {
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.tyres = tyres;
        this.seats = seats;
        this.body = body;
        this.isACar = true;

    }

    public int getHorsepower() {
        return ((IHorsepower) engine).getHorsepower();
    }

    public boolean isACar() {
        return this.isACar;
    }

}
