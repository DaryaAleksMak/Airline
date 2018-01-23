package entity;

import entity.plane.Plane;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Calculate {
    private Collection<Plane> collection;

    public Calculate() {
        collection = new Hanhar().getPlanes();
    }

    /**
     * @return  the total capacity of all the aircraft in the airline
     */
    public int getSumTotalCapacity() {
        int sum = collection.stream()
                .mapToInt(Plane::getCountSeats)
                .sum();
        return sum;
    }

    /**
     * @return carrying capacity of all the aircraft in the airline
     * */
    public int getSumCarrierCapacity() {
        int sum = collection.stream()
                .mapToInt(Plane::getCarrierCapacity)
                .sum();
        return sum;
    }

    /**
     *@return list of airplanes of the company sorted by flight range
     */
    public List<Plane> sortedByFlightRange() {
        return collection.stream().
                sorted((o1, o2) -> -((Integer) o1.getMaxDistance())
                        .compareTo(((Integer) o2.getMaxDistance())))
                .collect(Collectors.toList());

    }

    /**
     * @return list of airplanes corresponding to a given range of fuel consumption parameters
     */
    public List<Plane> filterRangeOfFuelConsumption(int min, int max) {
//        isValidValues(min, max);
        List<Plane> list = collection.stream()
                .filter((s) -> s.getFuelConsumption() >= min
                        && s.getFuelConsumption() <= max)
                .collect(Collectors.toList());
        return list;
    }

    public Collection<Plane> getCollection() {
        return collection;
    }

    public void setCollection(Collection<Plane> collection) {
        this.collection = collection;
    }

//    private void isValidValues(int min, int max) {
//        if ()
//    }


}
