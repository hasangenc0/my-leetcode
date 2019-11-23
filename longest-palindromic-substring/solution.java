class Solution {
    String palindrome = "";

    public String longestPalindrome(String s) {
        if (s.length() < 2) {
          return s;
        }

        for (int i = 0; i < s.length() - 1; ++i) {
          getPalindrome(s, i, i);
          getPalindrome(s, i, i + 1);
        }
      
      return palindrome;
    }
  
    public void getPalindrome(String s, int j, int k) {
        while(j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
          --j;
          ++k;
        }
  
        String sub = s.substring(j + 1 , k);
        if (sub.length() > palindrome.length()) {
          palindrome = sub;
        }
    }
}
