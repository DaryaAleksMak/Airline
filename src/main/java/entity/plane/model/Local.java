package entity.plane.model;


import impl.Plane;

public class Local extends Plane {
    public final static int MAX_CAPACITY = 20;

    public Local(String model, int countSeats, int carrierCapacity, int fuelConsumption) {
        super(model, countSeats, carrierCapacity, fuelConsumption);
    }
}
