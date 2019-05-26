package fruits.model;

public class Lemon extends Fruit {

    public Lemon(float weight) {
        super(weight);
        this.setTaste(Taste.ACID);
    }

    @Override
    public float getCalories() {
        return getWeight() / 58 * 17;
    }
}
