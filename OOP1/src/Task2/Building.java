package Task2;


import java.util.ArrayList;


public class Building {


    private final int numberOfBathrooms;

    private final int numberOfFloors;

    private final boolean isOfficeBuilding;


//2.e Create a constructor that populates all the fields above.
    public Building(int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding){

        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;

    }
//2.f As the fields of the Building class are private, create getters() for each of them.



    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }
}
