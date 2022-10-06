package Task2;

import java.util.ArrayList;

public class Main {
    //2.d Create a Building.java class with the following fields (use appropriate types):
//Rooms (make sure to use the 'final' keyword here as this variable should never change once it has been assigned a value)
//numberOfBathrooms
//numberOfFloors
//isOfficeBuilding
    private static final ArrayList<Room> Rooms = new ArrayList<>();


    //2.g In your main method, instantiate at least three different rooms.
    static Room JuliusPrison = new Room(1,0,0);
    static Room MadsenAwesomeGamingRoom = new Room(4,10,2);
    static Room Hogwarts = new Room(182,455,762);

    //2.i In your main method, instantiate a new building.

    static Building Pentagon = new Building(284,5,true);


    public static void main(String[] args) {






        //2.h Add the three rooms to a collection (preferably of the same data type used for the "Rooms" field in your Building.java class).

        Rooms.add(JuliusPrison);
        Rooms.add(MadsenAwesomeGamingRoom);
        Rooms.add(Hogwarts);

        //Calls and runs the function from 2k.
        isNormal(Pentagon);


    }
//2.j create a static method in Main, countLampsInBuilding, that takes an object of type Building, and returns the total number of lamps in the entire building.

public static int countLampsInBuilding(){
int totalLamps = 0;

  for(int i=0; i<Rooms.size(); i++ ){

totalLamps+= Rooms.get(i).getNumberOfLamps();

    }
return totalLamps;
}

//2.k create another static method in Main, isNormal, that takes an object of type Building.
// The method should return true if the Building's numberOfFloors is greater than its number of Rooms.
// If not it should print "This is an odd building" and return false.

    public static boolean isNormal(Building building){
        int totalRooms = Rooms.size() + building.getNumberOfBathrooms();
    int totalFloors= building.getNumberOfFloors();




    if(totalRooms<totalFloors){

        return true;


    }
    else{

        System.out.println("This is an odd building");

        return false;

    }
    }

}
