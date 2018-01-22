package entity.plane.builder;

import entity.plane.company.McDonnel;
import impl.PlaneBuilder;

public class McDonnelBuilder extends PlaneBuilder {

    public McDonnel build() {
        McDonnel mcDonnel = new McDonnel();
        mcDonnel.setModel(model);
        mcDonnel.setCountSeats(countSeats);
        mcDonnel.setCarrierCapacity(carrierCapacity);
        mcDonnel.setFuelConsumption(fuelConsumption);

        return mcDonnel;
    }
}
