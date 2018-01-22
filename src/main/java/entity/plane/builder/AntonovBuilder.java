package entity.plane.builder;

import entity.plane.company.Antonov;
import impl.PlaneBuilder;

public class AntonovBuilder extends PlaneBuilder {

    public Antonov build() {
        Antonov antonov = new Antonov();
        antonov.setModel(model);
        antonov.setCountSeats(countSeats);
        antonov.setCarrierCapacity(carrierCapacity);
        antonov.setFuelConsumption(fuelConsumption);

        return antonov;
    }
}
