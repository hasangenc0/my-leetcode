import java.util.*;

static List<Integer> freqQuery(int[][] queries) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> counts = new HashMap<>();

        List<Integer> result = new ArrayList<>();
         
        for(int i = 0; i < queries.length; ++i) {
            int cmd = queries[i][0];
            int val = queries[i][1];

            switch(cmd) {
                case 1:
                    Integer c = map.getOrDefault(val, 0) + 1;
                    map.put(val, c);
                    
                    counts.put(c, counts.getOrDefault(c, 0) + 1);
                    counts.put(c - 1, counts.getOrDefault(c - 1, 1) - 1);
                    break;
                case 2:
                    if(map.containsKey(val)) {
                        Integer v = map.get(val);
                        map.put(val, v <= 1 ? 0 : v - 1);                       
                        counts.put(v, counts.getOrDefault(v, 1) - 1);
                        counts.put(v - 1, counts.getOrDefault(v - 1, 0) + 1);
                    }
                    break;
                case 3:
                    if(counts.containsKey(val) && counts.get(val) > 0) {
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
