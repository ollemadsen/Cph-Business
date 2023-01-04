package WordTrimmer;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class WordTrimmer {

    public ArrayList<String> trimWord(ArrayList<String> a, int k, int m) {
    ArrayList<String> trim = new ArrayList<>();
        for (String s : a) {

            for (int i = 0; i < k; i++) {
            trim.add(s.substring(0,m));

            }
        }
        return trim;
    }
}