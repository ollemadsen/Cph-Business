package Task1;

public class Main {
    //1.h In the main method, instantiate a new Driver, populating the fields with your own name and age.
    static Driver oliver = new Driver("Oliver",21);

    //1.i In the main method, instantiate a new car, populating the field with whatever values you see fit.
    static Car mercedes = new Car("Mercedes", "AMG G wagon", 2020, "SUV");

//1.l In the main method, create yet another car and assign the same driver to this car.
    static Car BMW = new Car("BMW", "X6", 2022, "SUV");

    public static void main(String[] args) {

//1.j In the main method, assign the driver to the car created, using the setter method created in step 1.e
mercedes.setDriver(oliver);
BMW.setDriver(oliver);

//1.k print the toString method of the car you've created followed by the toString method of the driver.
        System.out.println(mercedes.toString());
        System.out.println(oliver.toString());

//1.m repeat the step 1.k for the new car created in 1.l.
        System.out.println(BMW.toString());
        System.out.println(oliver.toString());

    }
}