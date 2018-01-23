package entity.plane.builder;

import entity.plane.company.Antonov;
import entity.plane.PlaneBuilder;

public class AntonovBuilder extends PlaneBuilder {

    public Antonov build() {
        Antonov antonov = new Antonov();
        antonov.setModel(model);
        antonov.setCountSeats(countSeats);
        antonov.setCarrierCapacity(carrierCapacity);
        antonov.setFuelConsumption(fuelConsumption);
        antonov.setMaxDistance(maxDistance);
        return antonov;
    }
}
