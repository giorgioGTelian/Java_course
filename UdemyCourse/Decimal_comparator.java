import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        Scanner s = new Scanner(System.in);
        double first = s.nextDouble();
        double second = s.nextDouble();
        CompareDec(first, second);
    }

    public static boolean CompareDec(double first, double second) {
        if (first == second) {
            return true;
        } else if (first != second) {
            return false;
        } else {
            return false;
        }

    }
}
