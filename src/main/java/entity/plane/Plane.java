package entity.plane;

public class Plane {
    protected String model;
    protected int countSeats;
    protected int carrierCapacity;
    protected int fuelConsumption;
    protected int maxDistance;


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

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public String toString() {
        return "Model: " + model + ": " + "\n"
                + "                " + "Count of seats: " + countSeats + "\n"
                + "                " + "Carring capacity: " + carrierCapacity + "\n"
                + "                " + "Fuel consuption: " + fuelConsumption + "kg/h" + "\n"
                + "                " + "Max distance: " + maxDistance + "km" + "\n";
    }


}

