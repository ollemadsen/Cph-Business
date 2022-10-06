package Task3;

public class Customer {

    //3.a Lav en klasse, Customer, med attributterne:
    // String firstName String lastName String username int id
    private String firstName;

    private String lastName;

    private String username;

    private int id;

//Giv klassen en toString() metode, der printer kundens detaljer pænt ud.
    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    //3.b Klassen skal have en konstruktor der tager et parameter med kundens navn og brugernavn.
    public Customer(String firstName, String username){

        this.firstName = firstName;
        this.username = username;


    }

//Gør alle klassens felter private, og tilføj getters().
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }
}
