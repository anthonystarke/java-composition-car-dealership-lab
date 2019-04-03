import CarComponents.*;
import Cars.ElectricCar;
import Cars.HybridCar;
import Cars.PetrolCar;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
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

        ArrayList<ICar> carCollection = new ArrayList<ICar>();
        carCollection.add(electricCar);
        carCollection.add(hybridCar);
        carCollection.add(petrolCar);

        dealership = new Dealership(carCollection);
    }

    @Test
    public void canGetDealershipStockCount() {
        assertEquals(3, dealership.stockCount());
    }


}
