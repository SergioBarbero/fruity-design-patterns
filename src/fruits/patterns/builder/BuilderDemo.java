package fruits.patterns.builder;

import fruits.model.Apple;
import fruits.model.Lemon;

public class BuilderDemo {
    public static void main(String[] args) {
        FruitSalad salad = new FruitSalad.FruitSaladBuilder("Super boring salad").setApple(new Apple(200)).setLemon(new Lemon(100)).build();
        System.out.println("This salad has " + salad.getCalories() + " calories ");
    }
}
