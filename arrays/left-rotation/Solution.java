public class Solution {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        for (int i = 0; i < d; ++i) {
            for (int j = 0; j + 1 < a.length; ++j) {
                int temp = a[j];
                a[j] = a[j + 1];
                a[j+1] = temp;
            }   
        }

        return a;
    }
}
