package main.ua.lessons;

/**
 * Created by temma on 15.01.2017.
 */
public class ArgRunner {

    public static void main(String[] args) {
        System.out.println("Calculate...");
        if (args.length == 2)
        {
            int first = Integer.valueOf(args[0]);
            int second = Integer.valueOf(args[1]);
            Calculator calc = new Calculator();
            calc.add(first,second);
            System.out.println("Sum: " + calc.getresult());
        }
        else
        {
            System.out.println("Enter two parameters.");
        }

    }
}
