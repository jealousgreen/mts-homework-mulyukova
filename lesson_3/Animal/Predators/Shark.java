package lesson_3.Animal.Predators;

import lesson_3.Animal.Predators.Predator;

public class Shark extends Predator {
    public Shark(String breed, String name, Double cost, String character) {
        super(breed, name, cost, character);
        hunt();
    }

    @Override
    public void hunt() {
        System.out.println(" Shark hunt");
    }
}