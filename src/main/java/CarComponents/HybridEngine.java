package CarComponents;

import CarComponents.Engine;

public class HybridEngine extends Engine implements IRangeElectric, IRangePetrol{
    private int rangeElectric;
    private int rangePetrol;

    public HybridEngine(int horsepower, int rangeElectric, int rangePetrol) {
        super(horsepower);
        this.rangeElectric = rangeElectric;
        this.rangePetrol = rangePetrol;
    }

    public int getRangeElectric() {
        return rangeElectric;
    }

    public int getRangePetrol() {
        return rangePetrol;
    }

    public int getRangeTotal() {
        return this.rangeElectric + this.rangePetrol;
    }
}
