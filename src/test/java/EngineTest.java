import CarComponents.ElectricEngine;
import CarComponents.HybridEngine;
import CarComponents.PetrolEngine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    ElectricEngine electricEngine;
    HybridEngine hybridEngine;
    PetrolEngine petrolEngine;

    @Before
    public void before() {
        electricEngine = new ElectricEngine(150, 100);
        hybridEngine = new HybridEngine(175, 120, 120);
        petrolEngine = new PetrolEngine(200, 200);
    }

    @Test
    public void canGetHorsepower() {
        assertEquals(150, electricEngine.getHorsepower());
        assertEquals(175, hybridEngine.getHorsepower());
        assertEquals(200, petrolEngine.getHorsepower());
    }

    @Test
    public void canGetRangeElectric() {
        assertEquals(100, electricEngine.getRangeElectric());
        assertEquals(120, hybridEngine.getRangeElectric());
    }

    @Test
    public void canGetRangePetrol() {
        assertEquals(120, hybridEngine.getRangePetrol());
        assertEquals(200, petrolEngine.getRangePetrol());
    }


}
