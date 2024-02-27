package lesson_3.Animal.Predators;

import lesson_3.Animal.AbstractAnimal;

public class Predator extends AbstractAnimal {

    public Predator(String breed, String name, Double cost, String character) {
        super(breed, name, cost, character);
    }

    public void hunt(){
        System.out.println("Охота");
    }
}