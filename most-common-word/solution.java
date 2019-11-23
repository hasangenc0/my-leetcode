import java.util.*;

class Solution {
    public boolean contains(String[] arr, String s) {
      for (int i = 0; i < arr.length; ++i) {
        if (arr[i].equals(s)) {
          return true;
        }
      }
      
      return false;
    }
  
    public String mostCommonWord(String paragraph, String[] banned) {
      String[] words = paragraph.toLowerCase().split("\\W+");
      HashMap<String, Integer> map = new HashMap<String, Integer>();
      Set<String> ban = new HashSet<>(Arrays.asList(banned));

      String maxWord = "";
      int maxCount = 0;

      for (int i = 0; i < words.length; ++i) {
        if (contains(banned, words[i])) {
          continue;  
        }
        
        int count = map.containsKey(words[i]) ? map.get(words[i]) + 1 : 1;
        map.put(words[i], count);

        if (count > maxCount) {
          maxCount = count;
          maxWord = words[i];
        }
      }
      
      return maxWord;
    }
}
