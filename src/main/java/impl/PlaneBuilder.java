package impl;

import iface.Builder;

public abstract class PlaneBuilder<T extends Plane> implements Builder {
    protected String model;
    protected int countSeats;
    protected int carrierCapacity;
    protected int fuelConsumption;

    PlaneBuilder buildModel(String model){
        this.model = model;
        return this;
    }

    public PlaneBuilder buildCountSeats(int countSeats){
        this.countSeats = countSeats;
        return this;
    }

    public PlaneBuilder buildCarrierCapacity(int carrierCapacity){
        this.carrierCapacity = carrierCapacity;
        return this;
    }

    public PlaneBuilder buildFuelConsumption(int fuelConsumption){
        this.fuelConsumption = fuelConsumption;
        return this;
    }

    public abstract T  build();


}
