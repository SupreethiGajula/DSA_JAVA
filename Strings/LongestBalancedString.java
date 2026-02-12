/**
 * Returns the length of the longest balanced substring in the given string.
 *
 * A substring is considered balanced if all distinct characters in that
 * substring appear the same number of times.
 *
 * Approach:
 * - Fix a starting index and expand the substring one character at a time.
 * - Maintain a frequency array of size 26 for lowercase letters.
 * - After each expansion, check whether all non-zero character frequencies
 *   are equal.
 * - Track and update the maximum length of such balanced substrings.
 *
 * Time Complexity:
 * O(n^2) — There are O(n^2) possible substrings, and for each substring
 * we perform a constant-time (O(26)) frequency check.
 *
 * Space Complexity:
 * O(1) — Uses a fixed-size frequency array of length 26.
 */


class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int maxlen = 0;
        for(int i=0;i<n;i++){
            int freq[] = new int[26];
            for(int j=i;j<n;j++){
                char c = s.charAt(j);
                freq[c-'a']++;
                if(isBalanced(freq)){
            maxlen = Math.max(maxlen,j-i+1);
        }
            }
            
        }
        return maxlen;
        
    }
    private boolean isBalanced(int[] freq) {
    int count = 0;

    for (int f : freq) {
        if (f > 0) {   // <-- ignore zeros
            if (count == 0) {
                count = f;
            } else if (count != f) {
                return false;
            }
        }
    }

    return count > 0;
}

    }
