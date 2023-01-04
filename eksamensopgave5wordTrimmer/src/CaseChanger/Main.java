package CaseChanger;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            ArrayList<String> sparta = new ArrayList<>();

            CaseChanger upper  = new CaseChanger();
            sparta.add("This");
            sparta.add("is");
            sparta.add("sparta");

            upper.allUpperCase(sparta);

            System.out.println();


        }
}
