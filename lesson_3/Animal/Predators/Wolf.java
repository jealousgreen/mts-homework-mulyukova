package lesson_3.Animal.Predators;

import lesson_3.Animal.Predators.Predator;

public class Wolf extends Predator {
    public Wolf(String breed, String name, Double cost, String character) {
        super(breed, name, cost, character);
        hunt();
    }

    @Override
    public void hunt() {
        System.out.println(" Wolf hunt");
    }
}