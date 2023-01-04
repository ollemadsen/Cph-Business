package Bank;

import java.sql.Array;

public class Person {

    Account[] accounts = new Account[3];

    public Person(int b1, int b2, int b3) {
        accounts[0] = new Account(b1);
        accounts[1] = new Account(b2);
        accounts[2] = new Account(b3);
    }

    int totalValue(){
        int sum = 0;
        for (Account b:accounts
             ) {
            sum += b.balance;

        }
        return sum;
    }
}
