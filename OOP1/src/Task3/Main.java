package Task3;


import java.util.ArrayList;

public class Main {

    //3.c Skriv en Main klasse med en main metode, hvor der oprettes en beholder af typen ArrayList, som du kalder 'customers'. Denne skal være erklæret som static
    private static final ArrayList<Customer> customers = new ArrayList<>();

    //. I customers skal du placere 6 instanser af Customer typen.
    static Customer c1 = new Customer("Hanne", "HanneSlayer44");
    static Customer c2 = new Customer("Frank", "Frankeboi69");
    static Customer c3 = new Customer("Jonas", "JonKanon");
    static Customer c4 = new Customer("Alexander", "VindSpillePind");
    static Customer c5 = new Customer("Julius", "TisserISengenx8");
    static Customer c6 = new Customer("Bjarne", "Genius291");



    public static void main(String[] args) {

        //(Du kan oprette instanserne først, og så add'e dem til array'et. Du kan også adde og instantiere i samme linie.)
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);
        customers.add(c5);
        customers.add(c6);

//Test metoden fra main ved at kalde den.

                printCustomers();


    }
    //3.d Skriv en metode i Main kaldet printCustomers(), hvor du printer alle kunderne ud ved at gennemløbe 'customers' med et ’for each’ loop.
public static void printCustomers(){


    for (Customer a:customers) {
        System.out.println(a);
        
    }       

}

}
