package entity.plane.builder;

import entity.plane.company.Tupolev;
import impl.PlaneBuilder;

public class TupolevBuilder extends PlaneBuilder {

    public Tupolev build() {
        Tupolev tupolev = new Tupolev();
        tupolev.setModel(model);
        tupolev.setCountSeats(countSeats);
        tupolev.setCarrierCapacity(carrierCapacity);
        tupolev.setFuelConsumption(fuelConsumption);

        return tupolev;
    }
}
