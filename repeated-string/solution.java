public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long occur = 0;
        int len = s.length();
        for (int i = 0; i < len; ++i) {
            if (s.charAt(i) == 'a') {
                ++occur;
            }
        }
        
        occur = occur * (n / len);
        long others = (long) n % len;
        for (int i = 0; i < others; ++i) {
            if (s.charAt(i) == 'a') {
                ++occur;
            }
        }

        return occur;
    }
}
