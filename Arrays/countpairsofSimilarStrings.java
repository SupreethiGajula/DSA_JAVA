//Efficient: O(n * L), n = number of words, L = max word length
import java.util.*;

class Solution {
    public int similarPairs(String[] words) {
        Map<Set<Character>, Integer> map = new HashMap<>();
        
        for (String word : words) {
            // Convert word to set of characters
            Set<Character> charSet = new HashSet<>();
            for (char c : word.toCharArray()) {
                charSet.add(c);
            }
            
            // Increment count for this set
            map.put(charSet, map.getOrDefault(charSet, 0) + 1);
        }
        
        int result = 0;
        for (int count : map.values()) {
            // Number of pairs from count words with same set
            result += count * (count - 1) / 2;
        }
        
        return result;
    }
}
