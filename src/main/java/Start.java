import entity.plane.builder.AirbusBuilder;
import entity.plane.company.Airbus;
import impl.Plane;

public class Start {
    public static void main(String[] args) {
        Plane airbus = new AirbusBuilder()
                .buildModel("FY-32")
                .buildCountSeats(100)
                .buildFuelConsumption(2500)
                .buildCarrierCapacity(100)
                .build();

    }
}
