package main.ua.Lesson_13;

/**
 * Created by temma on 05.02.2017.
 */
public interface Cell<T> {

    boolean isBomb();

    boolean isSuggestBomb();

    boolean isSuggestEmpty();

    void suggestEmpty();

    void draw(T paint, boolean real);

}
