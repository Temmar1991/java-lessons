package main.ua.Lesson_13;

/**
 * Created by temma on 04.02.2017.
 */
public interface Board {

    /**

     */

    void drawBoard(Cell[][] cells);

    void drawCell(int x, int y);

    void drawBang();

    void drawCongratulate();
}
