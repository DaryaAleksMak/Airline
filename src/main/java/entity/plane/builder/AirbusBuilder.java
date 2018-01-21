package entity.plane.builder;

import entity.plane.company.Airbus;
import impl.PlaneBuilder;

public class AirbusBuilder extends PlaneBuilder {
    protected String model;
    protected int countSeats;
    protected int carrierCapacity;
    protected int fuelConsumption;

    public Airbus build() {
        Airbus airbus = new Airbus();
        airbus.setModel(model);
        airbus.setCountSeats(countSeats);
        airbus.setCarrierCapacity(carrierCapacity);
        airbus.setFuelConsumption(fuelConsumption);

        return airbus;
    }

}
