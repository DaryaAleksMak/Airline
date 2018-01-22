package entity;

import impl.Plane;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Calculate {
    private List planes = new Hanhar().getPlanes();

    public int getTotalCapacity()
    {
        Collection<Plane> collection = planes;
        int sum = collection.stream()
                .mapToInt(Plane::getCarrierCapacity)
                .sum();
        System.out.println(sum);





        return 0;
    }

    public int getCarrierCapacity(){
        return 0;
    }

    public void getListAircraft(){
    }

    public int getFuelConsumption(){
        return 0;
    }

}
