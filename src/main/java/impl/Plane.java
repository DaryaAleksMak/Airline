package impl;

import iface.Aircraft;

public abstract class Plane implements Aircraft {
    protected String model;
    protected int countSeats;
    protected int carrierCapacity;
    protected int fuelConsumption;


    public Plane(String model, int countSeats, int carrierCapacity, int fuelConsumption) {
        this.model = model;
        this.countSeats = countSeats;
        this.carrierCapacity = carrierCapacity;
        this.fuelConsumption = fuelConsumption;
    }



}

