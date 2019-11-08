public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int max = 0;

        for (int i = 0; i < 4; i ++) {
            for (int k = 0; k < 4; k++) {
                int sum = arr[i][k] + arr[i][k+1] + arr[i][k+2] + arr[i+1][k+1] + arr[i+2][k] + arr[i+2][k+1] + arr[i+2][k+2];
                if ((i == 0 && k == 0) || sum > max) {
                    max = sum;
                }
            }
        }

        return max;
    }
}
