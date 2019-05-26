package fruity.factory;

public class FruitFactoryDemo {
    public static void main(String[] args) {
        FruitFactory fruitFactory = new FruitFactory();

        Fruit fruit1 = fruitFactory.getFruit("APPLE", 242);

        float calories = fruit1.getCalories();

        System.out.println("* Your " + fruit1.getTaste().toString().toLowerCase() + " fruit has " + calories + " Kcal");
    }
}
