public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int curr = 0;
        int valleys = 0;

        for (int i = 0; i < s.length(); ++i) {
            int tmp = curr;
            curr += s.charAt(i) == 'U' ? 1 : -1;
            if (tmp == 0 && curr < 0) {
                ++valleys;
            }
        }

        return valleys;
    }
}
