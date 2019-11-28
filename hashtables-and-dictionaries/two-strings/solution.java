import java.util.*;

public class Solution {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        Hashtable<Character, Boolean> m1 = new Hashtable<Character, Boolean>();

        for (int i = 0; i < s1.length(); ++i) {
            m1.put(s1.charAt(i), true);
        }

        for (int i = 0; i < s2.length(); ++i) {
            if (m1.containsKey(s2.charAt(i))) {
                return "YES";
            }
        }

        return "NO";

    }
}
