import java.util.*;

public class Solution {
    static String sortString(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
        int result = 0;
        Hashtable<String, Integer> h = new Hashtable<String, Integer>(); 

        for (int i = 0; i < s.length(); ++i) {
            for (int j = 1; i + j <= s.length(); ++j) {
                String sub = sortString(s.substring(i, i + j));
                if (h.containsKey(sub)) {
                    int count = h.get(sub);
                    result += count;
                    h.put(sub, count + 1);
                } else {
                    h.put(sub, 1);
                }
            }
        }

        return result;
    }

}
