package entity.plane.builder;

import entity.plane.company.Boeing;
import entity.plane.PlaneBuilder;

public class BoeingBuilder extends PlaneBuilder {

    public Boeing build() {
        Boeing boeing = new Boeing();
        boeing.setModel(model);
        boeing.setCountSeats(countSeats);
        boeing.setCarrierCapacity(carrierCapacity);
        boeing.setFuelConsumption(fuelConsumption);
        boeing.setMaxDistance(maxDistance);
        return boeing;
    }
}
