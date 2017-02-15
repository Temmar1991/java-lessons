package ua.lessons.Lesson_6;

/**
 * Created by temma on 15.02.2017.
 */
public class Dog implements Pet {

    private final Pet pet;

    public Dog(final Pet pet) {

        this.pet = pet;
    }


    public void makeSound() {
        this.pet.makeSound();
        System.out.println("Gav, Gav");


    }

    public String getName() {
        return this.pet.getName();
    }
}
