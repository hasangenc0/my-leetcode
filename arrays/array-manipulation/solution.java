import java.util.*;

public class Solution {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        long[] arr = new long[n];
        long max = 0;
        long temp = 0;

        for (int i = 0; i < queries.length; ++i) {
            arr[queries[i][0] - 1] += queries[i][2];

            if (queries[i][1] < n) {
                arr[queries[i][1]] -= queries[i][2];
            }
        }

        for (int j = 0; j < n; ++j) {
            temp += arr[j];
            if (temp > max ) {
                max = temp;
            }
        }

        return max;
    }
}
