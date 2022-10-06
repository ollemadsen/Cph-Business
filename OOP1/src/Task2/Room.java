package Task2;

public class Room {

    //2.a Create a Room.java class with the following fields (use appropriate types and make them private):
    //numberOfDoors
    //numberOfLamps
    //numberOfWindows

    private final int numberOfDoors;

    private final int numberOfLamps;

    private final int numberOfWindows;

    //2.b Create a constructor that populates all the fields above.
    public Room(int numberOfDoors, int numberOfLamps, int numberOfWindows){

        this.numberOfDoors = numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;


    }

    //2.c As the fields of the Room class are private, create getters() for each of them,
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

}
