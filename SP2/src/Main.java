public class Main {
    public static void main(String[] args) {


        FleetOfCars myFleet = new FleetOfCars();

        Car eCar = new ElectricCar("232FG", "Audi", "E Tron", 4, 85, 575);

        Car gCar = new GasolinCar("2121QX", "Audi", "A5 S Line", 4, 10);

        Car dCar = new DieselCar("OS442DX", "Audi", "S4 sedan TDI", 4, 16, true);

        myFleet.addCar(eCar);
        myFleet.addCar(gCar);
        myFleet.addCar(dCar);

        System.out.println(myFleet);

        System.out.println("Total registration fee is: " + myFleet.getTotalRegistrationFeeForFleet());
    }
}