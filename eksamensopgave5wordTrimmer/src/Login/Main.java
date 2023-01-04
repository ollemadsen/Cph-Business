package Login;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<String> users = new ArrayList();
    static ArrayList<String> pass = new ArrayList();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        User p1 = new User("Sofie", "Forbrydelsen");
        User p2 = new User("Trine", "Arvingerne");
        User p3 = new User("Sidse", "Borgen");
        User p4 = new User("Ghita", "Matador");


        users.add(p1.getName());
        users.add(p2.getName());
        users.add(p3.getName());
        users.add(p4.getName());

        pass.add(p1.getPass());
        pass.add(p2.getPass());
        pass.add(p3.getPass());
        pass.add(p4.getPass());

        System.out.println("Enter Username");
        String userName = scan.nextLine();
        System.out.println("Enter Password");
        String passWord = scan.nextLine();

        Login(userName, passWord);

    }
    public static void Login(String userName, String passWord) {
        int userIndex = -1;
        int passIndex = -1;
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).equalsIgnoreCase(userName)){
                userIndex = i;
                for (int j = 0; j < pass.size(); j++){
                if(pass.get(j).equals(passWord)) {
                    passIndex = j;


            }
            }
            }
        }
        if(userIndex == passIndex && userIndex != -1){
            System.out.println("Succes!");
        }
        else{
            System.out.println("Login failed");
        }
    }
}
