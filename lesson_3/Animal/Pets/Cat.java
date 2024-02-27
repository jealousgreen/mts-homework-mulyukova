package lesson_3.Animal.Pets;

public class Cat extends Pet {
    public Cat(String breed, String name, Double cost, String character) {
        super(breed, name, cost, character);
        sleep();
    }

    @Override
    public void sleep() {
        System.out.println("Cat Sleep");
    }
}