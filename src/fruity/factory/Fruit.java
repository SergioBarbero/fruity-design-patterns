package fruity.factory;

public abstract class Fruit implements Energetic {

    private float weight;

    private Taste taste;

    Fruit(float weight) {
        this.weight = weight;
    }

    public Taste getTaste() {
        return taste;
    }

    public void setTaste(Taste taste) {
        this.taste = taste;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public abstract float getCalories();
}
