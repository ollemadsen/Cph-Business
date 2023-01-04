package CaseChanger;

import java.util.ArrayList;

public class CaseChanger {

public ArrayList<String> allUpperCase(ArrayList<String> a){
    ArrayList<String> result = new ArrayList<>();
    for (String s:a) {
        String newValue = s.toUpperCase();
        result.add(newValue);

    }

    for (String s:result) {
        System.out.println(s);
    }return result;
}
    public ArrayList<String> toLowerCase(ArrayList<String> b){
        ArrayList<String> result = new ArrayList<>();
        for (String s:b) {
            String newValue = s.toLowerCase();
            result.add(newValue);

        }

        for (String s:result) {
            System.out.println(s);
        }return result;
    }

}
