public class Solution {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        int len = c.length;
        for (int i = 0; i < len; ++i) {
            if (i + 2 < len && c[i+2] == 0) {
                jumps++;
                ++i;
                continue;
            }
            if (i + 1 < len && c[i+1] == 0) {
                jumps++;
                continue;
            }
        }
        return jumps;
    }
}
