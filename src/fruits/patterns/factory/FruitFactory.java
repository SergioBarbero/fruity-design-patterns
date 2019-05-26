package fruits.patterns.factory;

import fruits.model.Apple;
import fruits.model.Fruit;

public class FruitFactory {

    public Fruit getFruit(String fruit, float weight) {
        if (fruit.equalsIgnoreCase("APPLE")) {
            return new Apple(weight);
        }
        return null;
    }
}
