import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Calculator calc1 = new Calculator();

        System.out.println("What would you like to add");
        double result = Double.parseDouble(scan.nextLine());
        double result1 = Double.parseDouble(scan.nextLine());
        calc1.add(result);
        calc1.add(result1);
        System.out.println("Result:" + calc1.getResult());

        calc1.add(10);
        System.out.println(calc1.getResult());

        calc1.substract(5);
        System.out.println(calc1.getResult());

        calc1.clear();

        double[] array = {5, 10, 15, 20, 25};
        calc1.add(array);
        System.out.println(calc1.getResult());

    }
}