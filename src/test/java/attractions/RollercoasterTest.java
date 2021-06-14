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

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        child = new Visitor(10, 1.2, 40.0);
        adult = new Visitor(20, 1.6, 100.00);
        shortadult = new Visitor(25, 1.4, 100.00);
        young = new Visitor(10, 1.8, 100.00);
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
}
