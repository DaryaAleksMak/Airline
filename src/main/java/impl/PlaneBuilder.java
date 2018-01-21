package impl;


public abstract class PlaneBuilder<T extends Plane> {
    protected String model;
    protected int countSeats;
    protected int carrierCapacity;
    protected int fuelConsumption;

    public PlaneBuilder buildModel(String model){
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
