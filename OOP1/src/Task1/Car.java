package Task1;

public class Car {
//1.c Create a Car.java class with the following private fields (use appropriate types):
//make
//model
//year
//bodyStyle
//driver
private final String manufacturer;
private final String model;
private final int year;
private final String bodyStyle;
private Driver driver;

//1.d Create a constructor, that populates all the fields above, except the Driver.
    public Car(String manufacturer, String model, int year, String bodyStyle){

        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;



    }
//1.e A car is not instantiated with a Driver, so we need another way to assign and un-assign a driver to a car:
// create setter and a getter methods for the Driver variable, of the Car class.
    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }
//1.f override the toString method in the Car class, returning: "Make: "+make+". Model: "+model+ " ("+ year + "), BodyStyle: "+bodyStyle
    @Override
    public String toString() {
        return "Manufacturer: "+manufacturer+". Model: "+model+ " ("+ year + "), BodyStyle: "+bodyStyle;
    }
}
