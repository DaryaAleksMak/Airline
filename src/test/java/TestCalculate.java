import entity.Calculate;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class TestCalculate {
    Calculate calculate;

    @Before
    public void initCalcullate(){
        calculate = new Calculate();
        calculate.setCollection(null);
    }

    @Test
    public void testSumTotalCapacityException(){
        try{
            calculate.getSumTotalCapacity();
            Assert.fail();
        }catch (Exception e){
        }

    }

    @Test
    public void testSumCarrierCapacityException(){
        try{
            calculate.getSumCarrierCapacity();
            Assert.fail();
        }catch (Exception e){
        }
    }

    @Test
    public void testSortedByFlightRangeException(){
        try{
            calculate.sortedByFlightRange();
            Assert.fail();
        }catch (Exception e){
        }
    }

}


