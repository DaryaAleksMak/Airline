import entity.plane.builder.*;
import entity.plane.company.Airbus;
import entity.plane.company.McDonnel;
import entity.plane.company.Tupolev;
import impl.Plane;

import java.util.List;

public class Start {
    List<Plane>  
    public static void main(String[] args) {
        Plane an_2p = new AntonovBuilder()
                .buildModel("AN-2P")
                .buildCountSeats(800)
                .buildFuelConsumption(140)
                .buildCarrierCapacity(120)
                .build();

        Plane an_2 = new AntonovBuilder()
                .buildModel("AN-2")
                .buildCountSeats(50)
                .buildFuelConsumption(120)
                .buildCarrierCapacity(90)
                .build();

        Plane tu_124 = new TupolevBuilder()
                .buildModel("TU-124")
                .buildCountSeats(100)
                .buildFuelConsumption(2850)
                .buildCarrierCapacity(120)
                .build();

        Plane tu_134 = new TupolevBuilder()
                .buildModel("TU-134")
                .buildCountSeats(70)
                .buildFuelConsumption(3000)
                .buildCarrierCapacity(150)
                .build();

        Plane boeing_747 = new BoeingBuilder()
                .buildModel("Boeing-747")
                .buildCountSeats(250)
                .buildFuelConsumption(7000)
                .buildCarrierCapacity(170)
                .build();
        Plane boeing_777 = new BoeingBuilder()
                .buildModel("Boeing-777")
                .buildCountSeats(300)
                .buildFuelConsumption(7500)
                .buildCarrierCapacity(170)
                .build();

        Plane airbus_319 = new AirbusBuilder()
                .buildModel("A-319")
                .buildCountSeats(400)
                .buildFuelConsumption(2350)
                .buildCarrierCapacity(200)
                .build();

        Plane airbus_320 = new AirbusBuilder()
                .buildModel("A-320")
                .buildCountSeats(450)
                .buildFuelConsumption(2500)
                .buildCarrierCapacity(250)
                .build();

        Plane airbus_321 = new AirbusBuilder()
                .buildModel("A-321")
                .buildCountSeats(500)
                .buildFuelConsumption(2885)
                .buildCarrierCapacity(275)
                .build();

        Plane md_83 = new McDonnelBuilder()
                .buildModel("MD-83")
                .buildCountSeats(500)
                .buildFuelConsumption(3100)
                .buildCarrierCapacity(280)
                .build();

        Plane md_90 = new McDonnelBuilder()
                .buildModel("MD-90")
                .buildCountSeats(500)
                .buildFuelConsumption(2650)
                .buildCarrierCapacity(300)
                .build();


    }
}
