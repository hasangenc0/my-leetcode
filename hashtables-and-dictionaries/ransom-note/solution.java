import java.util.*;

public class Solution {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        Hashtable<String, Integer> w = new Hashtable<String, Integer>(); 

        for (int i = 0; i < magazine.length; ++i) {
            int count = w.containsKey(magazine[i]) ? w.get(magazine[i]) + 1 : 1;
            w.put(magazine[i], count);
        }

        for (int i = 0; i < note.length; ++i) {
            if (!w.containsKey(note[i])) {
                System.out.println("No");
                return;
            }
            int count = w.get(note[i]) - 1;
            if (count < 0) {
                System.out.println("No");
                return;
            }
            w.put(magazine[i], count);
        }

        System.out.println("Yes");
    }
}
