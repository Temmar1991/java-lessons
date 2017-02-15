package ua.lessons.Lesson_6;



/**
 * Created by temma on 15.02.2017.
 */
public class Animal implements Pet {

    private final String name;

    public Animal(final String name)
    {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void makeSound() {
        System.out.println(
                String.format("%s say : %s", this.name, "beep")
        );


    }
}
