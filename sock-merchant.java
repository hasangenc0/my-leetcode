import java.util.*;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] arr) {
        int pairs = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; ++i) {
            int color = arr[i];
            if (map.containsKey(color)) {
                map.put(color, map.get(color)+1);
            } else {
                map.put(color, 1);
            }
        }

        for (Map.Entry<Integer, Integer> pair: map.entrySet()) {
            pairs += pair.getValue()/ 2;
        }

        return pairs;
    }
}
