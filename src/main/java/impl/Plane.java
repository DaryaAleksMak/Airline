package impl;

import iface.Aircraft;

public class Plane {
    protected String model;
    protected int countSeats;
    protected int carrierCapacity;
    protected int fuelConsumption;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCountSeats() {
        return countSeats;
    }

    public void setCountSeats(int countSeats) {
        this.countSeats = countSeats;
    }

    public int getCarrierCapacity() {
        return carrierCapacity;
    }

    public void setCarrierCapacity(int carrierCapacity) {
        this.carrierCapacity = carrierCapacity;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}

