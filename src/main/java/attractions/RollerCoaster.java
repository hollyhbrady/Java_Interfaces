package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ISecurity, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge() > 12 && visitor.getHeight() > 1.45) {
            return true;
        }
        return false;
    }

    @Override
    public double defaultPrice() {
        return 8.4;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 2) {
            return defaultPrice() * 2;
        }
        return defaultPrice();
    }
}
