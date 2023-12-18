package powerpackage;


import org.junit.Test;

public class PowerTest {
    @Test
    public void testForOneRaisedToOneIsOne() {

        assertEquals(1,PowerFinder.calculatePower(1,1));

    }
    @Test
    public void testForTwoRaisedToOneIsTwo() {

        assertEquals(2,PowerFinder.calculatePower(2,1));

    }

    @Test
    public void testForTwoRaisedToTwoIsFour() {

        assertEquals(4,PowerFinder.calculatePower(2,2));

    }

    @Test
    public void testForThreeRaisedToTwoIsNine() {

        assertEquals(9,PowerFinder.calculatePower(3,2));

    }
}
