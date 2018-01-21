package entity.plane.builder;

import entity.plane.company.Boeing;
import impl.PlaneBuilder;

public class BoeingBuilder extends PlaneBuilder {
    protected String model;
    protected int countSeats;
    protected int carrierCapacity;
    protected int fuelConsumption;

    public Boeing build() {
        Boeing boeing = new Boeing();
        boeing.setModel(model);
        boeing.setCountSeats(countSeats);
        boeing.setCarrierCapacity(carrierCapacity);
        boeing.setFuelConsumption(fuelConsumption);

        return boeing;
    }
}
