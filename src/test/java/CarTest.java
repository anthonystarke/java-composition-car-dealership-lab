import CarComponents.*;
import Cars.ElectricCar;
import Cars.HybridCar;
import Cars.PetrolCar;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CarTest {

    ElectricCar electricCar;
    HybridCar hybridCar;
    PetrolCar petrolCar;
    ElectricEngine electricEngine;
    HybridEngine hybridEngine;
    PetrolEngine petrolEngine;
    Body body;
    Seats seats;
    Tyres tyres;

    @Before
    public void before() {
        body = new Body("Sports");
        seats = new Seats("Nissan");
        tyres = new Tyres("Firestone");
        electricEngine = new ElectricEngine(200, 150);
        hybridEngine = new HybridEngine(150, 200, 150);
        petrolEngine = new PetrolEngine(100, 100);
        electricCar = new ElectricCar(2000, "blue", electricEngine, tyres, seats, body);
        hybridCar = new HybridCar(1500, "green", hybridEngine, tyres, seats, body);
        petrolCar = new PetrolCar(1000, "black", petrolEngine, tyres, seats, body);
    }

    @Test
    public void canGetHorsepower() {
        assertEquals(200,electricCar.getHorsepower());
    }


}
