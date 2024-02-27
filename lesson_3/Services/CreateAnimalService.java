package lesson_3.Services;

import lesson_3.Animal.Pets.Cat;
import lesson_3.Animal.Pets.Dog;
import lesson_3.Animal.Predators.Wolf;
import lesson_3.Animal.Predators.Shark;

import java.util.Random;

public interface CreateAnimalService {

    default void randomAnimal() {
        int i = new Random().nextInt(1, 5);
        switch (i) {
            case 1:
                System.out.println(new Shark("Порода1", "Имя2", randomPrice(), "Злая"));
                break;
            case 2:
                System.out.println(new Wolf("Порода1", "Имя2", randomPrice(), "Спокойный"));
                break;
            case 3:
                System.out.println(new Dog("Порода1", "Имя2", randomPrice(), "Добрый"));
                break;
            case 4:
                System.out.println(new Cat("Порода1", "Имя2", randomPrice(), "[Хороший]"));
                break;
            default:
                System.out.println("Неперехваченная ошибка");
        }
    }

    default void createAnimal() {
        int i = 0;
        while (i < 10) {
            randomAnimal();
            i++;
        }
    }

    private Double randomPrice() {
        return new Random().nextDouble(1, 100000);
    }
}