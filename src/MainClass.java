import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Fib fib = new Fib();
        while (true) {
            Scanner in = new Scanner(System.in);
            String text = in.nextLine();
            int value = Integer.valueOf(text);

            System.out.println(fib.fibOf(value));
        }
    }
}

