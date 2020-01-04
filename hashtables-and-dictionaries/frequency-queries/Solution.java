import java.util.*;

public class Solution {
    static HashMap<Integer, Integer> map = new HashMap<>(); 
    static HashMap<Integer, HashMap<Integer, Integer>> counts = new HashMap<>();

    static void add(Integer val, Integer count) {
        if (counts.containsKey(count)) {
            HashMap<Integer, Integer> c = counts.get(count);
            if (c.containsKey(val)) {
                c.remove(val);
                counts.put(count, c);
            }
        }

        if (counts.containsKey(count + 1)) {
            HashMap<Integer, Integer> nc = counts.get(count + 1);
            nc.put(val, 1);
            counts.put(count + 1, nc);
        } else {
            HashMap<Integer, Integer> nc = new HashMap<>();
            nc.put(val, 1);
            counts.put(count + 1, nc);
        }
    }

    static void remove(Integer val, Integer count) {
        if (counts.containsKey(count)) {
            HashMap<Integer, Integer> c = counts.get(count);
            if (c.containsKey(val)) {
                c.remove(val);
                counts.put(count, c);
            }
        }

        if (counts.containsKey(count - 1)) {
            HashMap<Integer, Integer> nc = counts.get(count - 1);
            nc.put(val, 1);
            counts.put(count - 1, nc);
        } else {
            HashMap<Integer, Integer> nc = new HashMap<>();
            nc.put(val, 1);
            counts.put(count - 1, nc);
        }
    }

    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<int[]> queries) {
        List<Integer> result = new ArrayList<>();
         
        for(int[] q: queries) {
            int cmd = q[0];
            int val = q[1];

            switch(cmd) {
                case 1:
                    Integer c = map.getOrDefault(val, 0) + 1;
                    map.put(val, c);
                    add(val, c - 1);
                    break;
                case 2:
                    if(map.containsKey(val)) {
                        Integer v = map.get(val);
                        remove(val, v);
                        if (v - 1 == 0) {
                            map.remove(val);
                        } else {
                            map.put(val, v - 1);
                        }
                    }
                    break;
                case 3:
                    if(counts.containsKey(val) && counts.get(val).size() > 0) {
                        System.out.println(1);
                        result.add(1);
                    } else {
                        System.out.println(0);
                        result.add(0);
                    }
                    break;
            }
        }
        return result;
    }

}
