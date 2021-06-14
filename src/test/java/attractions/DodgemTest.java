package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor young;
    Visitor older;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        young = new Visitor(10, 1.8, 100.00);
        older = new Visitor(20, 2.1, 100.00);
    }

    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(4.5, dodgems.defaultPrice(),0.0);
    }

    @Test
    public void priceForYoung(){
        assertEquals(2.25, dodgems.priceFor(young), 0.0);
    }

    @Test
    public void priceForOlder(){
        assertEquals(4.5, dodgems.priceFor(older), 0.0);
    }
}
