package CarComponents;

import CarComponents.Engine;

public class PetrolEngine extends Engine implements IRangePetrol{
    private int rangePetrol;

    public PetrolEngine(int horsepower, int rangePetrol) {
        super(horsepower);
        this.rangePetrol = rangePetrol;
    }

    public int getRangePetrol() {
        return this.rangePetrol;
    }

}
