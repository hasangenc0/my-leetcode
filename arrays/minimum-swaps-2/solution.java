public class Solution {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int swaps = 0;
        for (int i = 0; i + 1 < arr.length;) {
            if (arr[i] != i+1) {
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
                ++swaps;
            } else {
                ++i;
            }
        }
        return swaps;
    }
}
