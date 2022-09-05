import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTests {

    WaterBottle myWaterBottle;

    @Before
    public void before() {
        myWaterBottle = new WaterBottle(100, 10);
    }

    @Test
    public void afterDrink() {
        assertEquals(90, myWaterBottle.afterDrink());
    }

    @Test
    public void emptyVolume(){
        assertEquals(0, myWaterBottle.empty());
    }

    @Test
    public void fillVolume(){
        assertEquals(100, myWaterBottle.fill());
    }


}

//Create a water bottle class with a volume property.
//The volume should start at 100.
//Add a drink function that takes 10 from the volume each time it is called.
//Create an empty function that brings the volume down to 0.
//Create a fill function that fills the volume back to 100.