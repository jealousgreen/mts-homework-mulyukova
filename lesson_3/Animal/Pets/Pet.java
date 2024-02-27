package lesson_3.Animal.Pets;

import lesson_3.Animal.AbstractAnimal;

public class Pet extends AbstractAnimal {
    public Pet(String breed, String name, Double cost, String character) {
        super(breed, name, cost, character);
    }

    public void sleep() {
        System.out.println("Спать");
    }
}