package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double defaultPrice() {
        return 4.5;
    }

//    @Override
//    public double priceFor(Visitor visitor) {
//        if (visitor.getAge() < 12) {
//            return defaultPrice() / 2;
//        }
//        return defaultPrice();
//    }

    public double priceFor(Visitor visitor) {
        double modifier = visitor.getAge() < 12 ? 0.5 : 1.0;
        return defaultPrice() * modifier;
    }
}
