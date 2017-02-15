package main.ua.Lesson_13;

/**
 * Created by temma on 05.02.2017.
 */
public interface SaperLogic {

    void LoadBoard(Cell[][] cells);

    boolean shouldBang();

    boolean finish();

    void suggest(int x, int y, boolean bomb);
}
