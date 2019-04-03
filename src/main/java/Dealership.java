import CarComponents.ICar;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<ICar> carStock;

    public Dealership(ArrayList<ICar> carStock){
        this.carStock = carStock;
    }

    public int stockCount() {
        return this.carStock.size();
    }
}
