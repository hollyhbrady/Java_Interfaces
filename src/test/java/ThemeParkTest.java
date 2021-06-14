import attractions.Attraction;
import attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;
import stalls.CandyflossStall;
import stalls.ParkingSpot;
import stalls.Stall;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Attraction dodgems;
    Stall candyflossStall;

    @Before
    public void before(){
        dodgems = new Dodgems("Bumper Cars", 5);
        candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1, 8);
        themePark = new ThemePark();
    }

    @Test
    public void canAddAttractions(){
        themePark.addAttraction(dodgems);
        assertEquals(1, themePark.getAttractions());
    }

    @Test
    public void canAddStalls(){
        themePark.addStall(candyflossStall);
        assertEquals(1, themePark.getStalls());
    }

    @Test
    public void getIReviewed(){
        themePark.addAttraction(dodgems);
        themePark.addStall(candyflossStall);
        assertEquals(2, themePark.getAllReviewed().size());
    }
}
