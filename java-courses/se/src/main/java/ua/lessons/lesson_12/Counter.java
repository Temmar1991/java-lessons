package ua.lesson_12;

/**
 * Created by temma on 01.02.2017.
 */
public class Counter {

    private int ammount;

        public  synchronized int increase()
        {
            ammount++;
            return ammount;
        }

        public static synchronized void echo()
        {

        }


}
