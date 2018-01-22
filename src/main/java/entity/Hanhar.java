package entity;

import entity.plane.builder.*;
import impl.Plane;
import java.util.ArrayList;
import java.util.List;


public class Hanhar {
    static Plane an_2;
    static Plane an_2p;
    static Plane tu_124;
    static Plane tu_134;
    static Plane boeing_747;
    static Plane boeing_777;
    static Plane airbus_319;
    static Plane airbus_320;
    static Plane airbus_321;
    static Plane md_83;
    static Plane md_90;
    static {
        an_2p = new AntonovBuilder()
                .buildModel("AN-2P")
                .buildCountSeats(800)
                .buildFuelConsumption(140)
                .buildCarrierCapacity(120)
                .build();

        an_2 = new AntonovBuilder()
                .buildModel("AN-2")
                .buildCountSeats(50)
                .buildFuelConsumption(120)
                .buildCarrierCapacity(90)
                .build();

        tu_124 = new TupolevBuilder()
                .buildModel("TU-124")
                .buildCountSeats(100)
                .buildFuelConsumption(2850)
                .buildCarrierCapacity(120)
                .build();

        tu_134 = new TupolevBuilder()
                .buildModel("TU-134")
                .buildCountSeats(70)
                .buildFuelConsumption(3000)
                .buildCarrierCapacity(150)
                .build();

        boeing_747 = new BoeingBuilder()
                .buildModel("Boeing-747")
                .buildCountSeats(250)
                .buildFuelConsumption(7000)
                .buildCarrierCapacity(170)
                .build();
        boeing_777 = new BoeingBuilder()
                .buildModel("Boeing-777")
                .buildCountSeats(300)
                .buildFuelConsumption(7500)
                .buildCarrierCapacity(170)
                .build();

        airbus_319 = new AirbusBuilder()
                .buildModel("A-319")
                .buildCountSeats(400)
                .buildFuelConsumption(2350)
                .buildCarrierCapacity(200)
                .build();

        airbus_320 = new AirbusBuilder()
                .buildModel("A-320")
                .buildCountSeats(450)
                .buildFuelConsumption(2500)
                .buildCarrierCapacity(250)
                .build();

        airbus_321 = new AirbusBuilder()
                .buildModel("A-321")
                .buildCountSeats(500)
                .buildFuelConsumption(2885)
                .buildCarrierCapacity(275)
                .build();

        md_83 = new McDonnelBuilder()
                .buildModel("MD-83")
                .buildCountSeats(500)
                .buildFuelConsumption(3100)
                .buildCarrierCapacity(280)
                .build();

        md_90 = new McDonnelBuilder()
                .buildModel("MD-90")
                .buildCountSeats(500)
                .buildFuelConsumption(2650)
                .buildCarrierCapacity(300)
                .build();
    }

    static List<Plane> planes = new ArrayList<Plane>(){{
        add(an_2);
        add(an_2p);
        add(tu_124);
        add(tu_134);
        add(boeing_747);
        add(boeing_777);
        add(airbus_319);
        add(airbus_320);
        add(airbus_321);
        add(md_83);
        add(md_90);
    }};


//    private  void listInit(){
//        planes = new ArrayList<Plane>(){{
//            add(an_2);
//            add(an_2p);
//            add(tu_124);
//            add(tu_134);
//            add(boeing_747);
//            add(boeing_777);
//            add(airbus_319);
//            add(airbus_320);
//            add(airbus_321);
//            add(md_83);
//            add(md_90);
//        }};
//
//    }




    public static List<Plane> getPlanes() {
        return planes;
    }
}
