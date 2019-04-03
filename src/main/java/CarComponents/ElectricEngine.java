package CarComponents;

import CarComponents.Engine;

public class ElectricEngine extends Engine implements IRangeElectric {
    private int rangeElectric;

    public ElectricEngine(int horsepower, int rangeElectric) {
        super(horsepower);
        this.rangeElectric = rangeElectric;
    }

    public int getRangeElectric() {
        return rangeElectric;
    }

}
