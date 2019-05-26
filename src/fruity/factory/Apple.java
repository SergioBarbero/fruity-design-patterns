package fruity.factory;

public class Apple extends Fruit {

    Apple(float weight) {
        super(weight);
        this.setTaste(Taste.SWEET);
    }

    @Override
    public float getCalories() {
        return getWeight() / 182 * 95;
    }


}
