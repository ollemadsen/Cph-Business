import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Please type your name");

        //Takes users input as a string (name)
        String name = scan.nextLine();

        //prints the name the user types in
        System.out.println(name);

        System.out.println("Please type your age");

        //Takes the users input as an int (age)
        int age = scan.nextInt();

        //prints the value the user inputs
        System.out.println(age);

        //Calculates period of years until retirement
        int retirementAge = 67;
        int yearsToRetirement = retirementAge - age;

        //display yearsToRetirement
        System.out.println(name + ", you can retire in " + yearsToRetirement + " years");


        }



    }
