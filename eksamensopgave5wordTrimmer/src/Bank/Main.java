package Bank;

public class Main {
    public static void main(String[] args) {


        Person peter = new Person(1000,2000,3000);
        Person janne = new Person(4000,-1000,2000);
        Person jens = new Person(1800,-1000,-500);



        /*for (Account a: peter.accounts
             ) {
            System.out.println(a.balance);

        }*/

        System.out.println(peter.totalValue());
        System.out.println(janne.totalValue());
        System.out.println(jens.totalValue());
    }
}