import java.util.*;

public class Solution {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        Hashtable<String, Integer> m = new Hashtable<String, Integer>(); 
        Hashtable<String, Integer> n = new Hashtable<String, Integer>(); 

        for (int i = 0; i < note.length; ++i) {
            int count = n.containsKey(note[i]) ? n.get(note[i]) + 1 : 1;
            n.put(note[i], count);
        }

        for (int i = 0; i < magazine.length; ++i) {
            int count = m.containsKey(magazine[i]) ? m.get(magazine[i]) + 1 : 1;
            m.put(magazine[i], count);
        }

        for (String key : n.keySet()) {
            if (!(m.containsKey(key) && n.get(key) <= m.get(key))) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
