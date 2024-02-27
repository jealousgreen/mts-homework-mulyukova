package lesson_3.Animal.Pets;

import lesson_3.Animal.Pets.Pet;

public class Dog extends Pet {
    public Dog(String breed, String name, Double cost, String character) {
        super(breed, name, cost, character);
        sleep();
    }

    @Override
    public void sleep() {
        System.out.println("Dog Sleep");
    }
}