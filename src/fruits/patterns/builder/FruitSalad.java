package fruits.patterns.builder;

import fruits.model.Apple;
import fruits.model.Energetic;
import fruits.model.Lemon;

public class FruitSalad implements Energetic {

    private String name;

    private Apple apple;
    private Lemon lemon;

    public FruitSalad(FruitSaladBuilder builder) {
        this.apple = builder.apple;
        this.lemon = builder.lemon;
    }

    @Override
    public float getCalories() {
        return apple.getCalories() + lemon.getCalories();
    }

    public static class FruitSaladBuilder {

        private String name;

        private Apple apple;
        private Lemon lemon;

        public FruitSaladBuilder(String name) {
            this.name = name;
        }


        public FruitSaladBuilder setApple(Apple apple) {
            this.apple = apple;
            return this;
        }

        public FruitSaladBuilder setLemon(Lemon lemon) {
            this.lemon = lemon;
            return this;
        }

        public FruitSalad build() {
            return new FruitSalad(this);
        }
    }
}
