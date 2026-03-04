// Let the function f(s) be the frequency of the lexicographically smallest character in a non-empty string s. For example, if s = "dcce" then f(s) = 2 because the lexicographically smallest character is 'c', which has a frequency of 2.

// You are given an array of strings words and another array of query strings queries. For each query queries[i], count the number of words in words such that f(queries[i]) < f(W) for each W in words.

// Return an integer array answer, where each answer[i] is the answer to the ith query.
class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] wordFreq = new int[words.length];
        
        // Step 1: Compute frequency for words
        for (int i = 0; i < words.length; i++) {
            wordFreq[i] = f(words[i]);
        }
        
        // Step 2: Sort word frequencies
        Arrays.sort(wordFreq);
        
        int[] result = new int[queries.length];
        
        // Step 3: For each query, use binary search
        for (int i = 0; i < queries.length; i++) {
            int queryFreq = f(queries[i]);
            int index = upperBound(wordFreq, queryFreq);
            result[i] = wordFreq.length - index;
        }
        
        return result;
    }
    
    // Function to compute f(s)
    private int f(String s) {
        char minChar = 'z';
        int count = 0;
        
        for (char c : s.toCharArray()) {
            if (c < minChar) {
                minChar = c;
                count = 1;
            } else if (c == minChar) {
                count++;
            }
        }
        
        return count;
    }
    
    // Binary search: first index where value > target
    private int upperBound(int[] arr, int target) {
        int left = 0, right = arr.length;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        return left;
    }
}
