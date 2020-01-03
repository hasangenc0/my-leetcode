import java.util.*;

public class Solution {

    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {
        long result = 0;
        HashMap<Long, Long> count = new HashMap<>();
        HashMap<Long, Long> triplets = new HashMap<>();

        for (int i = arr.size() - 1; i >= 0; --i) {
            Long val = arr.get(i);
            Long nextVal = val*r;

            if(triplets.containsKey(nextVal)) {
                result += triplets.get(nextVal);
            }

            if(count.containsKey(nextVal)) {
                long c = count.get(nextVal);
                triplets.put(val, triplets.getOrDefault(val, 0L) + c);
            }

            count.put(val, count.getOrDefault(val, 0L) + 1); 
        }

        return result;
    }

}
