package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor child;
    Visitor adult;
    Visitor shortadult;
    Visitor young;
    Visitor talladult;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        child = new Visitor(10, 1.2, 40.0);
        adult = new Visitor(20, 1.6, 100.00);
        shortadult = new Visitor(25, 1.4, 100.00);
        young = new Visitor(10, 1.8, 100.00);
        talladult = new Visitor(20, 2.1, 100.00);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void isAllowedToTrue(){
        assertEquals(true, rollerCoaster.isAllowedTo(adult));
    }
    @Test
    public void isAllowedToFalseAgeHeight(){
        assertEquals(false, rollerCoaster.isAllowedTo(child));
    }

    @Test
    public void isAllowedToFalseAge(){
        assertEquals(false, rollerCoaster.isAllowedTo(young));
    }

    @Test
    public void isAllowedToFalseHeight(){
        assertEquals(false, rollerCoaster.isAllowedTo(shortadult));
    }

    @Test
    public void getDefaultPrice(){
        assertEquals(8.4, rollerCoaster.defaultPrice(), 0.0);
    }

    @Test
    public void getPriceForTall(){
        assertEquals(16.8, rollerCoaster.priceFor(talladult), 0.0);
    }

    @Test
    public void getPriceForShort(){
        assertEquals(8.4, rollerCoaster.priceFor(adult), 0.0);
    }
}
