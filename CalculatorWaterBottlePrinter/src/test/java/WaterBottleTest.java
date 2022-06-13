import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before (){
        waterbottle = new WaterBottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void drinkWater10(){
        waterbottle.drinkWater();
        assertEquals(90, waterbottle.getVolume());
    }

    @Test
    public void drinkWater10ThreeTimes(){
        waterbottle.drinkWater();
        waterbottle.drinkWater();
        waterbottle.drinkWater();
        assertEquals(70, waterbottle.getVolume());
    }

    @Test
    public void emptyWaterBottle(){
        waterbottle.emptyBottle();
        assertEquals(0,waterbottle.getVolume());
    }

    @Test
    public void hasFullBottle(){
        waterbottle.fillWaterBottle();
        assertEquals(100,waterbottle.getVolume());
    }

}

