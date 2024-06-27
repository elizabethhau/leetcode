import java.util.HashMap;

class Solution {
  public int lengthOfLongestSubstring(String s) {
      int sLen = s.length();
      if (sLen == 0 || sLen == 1) {
          return sLen;
      }
      HashMap<Character, Integer> seen = new HashMap<Character, Integer>();
      int currMax = 0;
      int left = 0;

      for (int right = 0; right < sLen; right++) {
          char currChar = s.charAt(right);
          // System.out.println(currChar);
          if (!seen.containsKey(currChar) || seen.get(currChar) < left) {
              seen.put(currChar, right);
              currMax = Math.max(currMax, right - left + 1);
              // System.out.println("added to set in if. set size: " + seen.size());
          } else {
              // System.out.println("")
              // currMax = Math.max(currMax, seen.size());
              // seen.clear();
              // seen.add(currChar);
              left = seen.get(currChar) + 1;
              seen.put(currChar, right);
              // System.out.println("added " + currChar + "to map in else. set size: " + seen.size());
          }
      }
      // return Math.max(currMax, seen.size());
      return currMax;
  }
}