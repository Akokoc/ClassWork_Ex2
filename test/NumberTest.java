import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class NumberTest {
    ArrayList<Integer> arr = new ArrayList<>();


    @Test
    public void maxOccurenceHappyTest(){
        arr.add(8);
        arr.add(1);
        arr.add(8);
        assertEquals(8, Number.maxOccurenceNumber(arr));;
    }
    @Test
    public void maxOccuranceNTest(){
        arr.add(1);
        assertEquals(1,Number.maxOccurenceNumber(arr));
    }
    @Test
    public void maxOccurenceNegatTest(){
        arr.add(1);
        arr.add(8);
        arr.add(3);
        assertEquals(1,Number.maxOccurenceNumber(arr));

    }


}