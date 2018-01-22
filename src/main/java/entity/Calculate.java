package entity;

import impl.Plane;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Calculate {
    private List planes = new Hanhar().getPlanes();

    public int getSumTotalCapacity()
    {
        Collection<Plane> collection = planes;
        int sum = collection.stream()
                .mapToInt(Plane::getCountSeats)
                .sum();
        return sum;
    }

    public int getSumCarrierCapacity(){
        Collection<Plane> collection = planes;
        int sum = collection.stream()
                .mapToInt(Plane::getCarrierCapacity)
                .sum();
        return sum;
    }

    public List<Plane> sortedByFlightRange(){
        Collection<Plane> collection = planes;
        return collection.stream().
                sorted((o1, o2) -> -((Integer) o1.MAX_DISTANCE).compareTo(((Integer)o2.MAX_DISTANCE)))
                .collect(Collectors.toList());

    }

    public List<Plane> filterRangeOfFuelConsumption(int min, int max){
        Collection<Plane> collection = planes;
        List<Plane> list = collection.stream()
                .filter((s) -> s.getFuelConsumption() >=min && s.getFuelConsumption() <= max )
                .collect(Collectors.toList());
        return list;
    }

}
