package Cars;

import CarComponents.*;

public class ElectricCar extends Car{

    public ElectricCar(int price, String colour, ElectricEngine engine, Tyres tyres, Seats seats, Body body){
        super(price,colour, engine, tyres, seats, body);
    }

    public int getHorsePower() {
        return ((IHorsepower) engine).getHorsepower();
    }

}
