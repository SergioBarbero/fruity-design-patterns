package fruits.model;

public class Apple extends Fruit {

    public Apple(float weight) {
        super(weight);
        this.setTaste(Taste.SWEET);
    }

    @Override
    public float getCalories() {
        return getWeight() / 182 * 95;
    }


}
