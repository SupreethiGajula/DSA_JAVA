//divide and conquer prefered compared to the dynamic sliding window approach
//Given a string s and an integer k, return the length of the longest substring of s such that the frequency of each 
//character in this substring is greater than or equal to k.

//if no such substring exists, return 0.
// Example 1:

// Input: s = "aaabb", k = 3
// Output: 3
// Explanation: The longest substring is "aaa", as 'a' is repeated 3 times.
// Example 2:

// Input: s = "ababbc", k = 2
// Output: 5
// Explanation: The longest substring is "ababb", as 'a' is repeated 2 times and 'b' is repeated 3 times.
 

class Solution {
    public int longestSubstring(String s, int k) {
        return helper(s,0,s.length(),k);
    }
    private int helper(String s , int start,int end,int k){
        if(end-start<k) return 0;
            int [] freq = new int[26];
            for(int i=start;i<end;i++){
                freq[s.charAt(i) - 'a']++;
            }

            for(int mid = start;mid<end;mid++){
                if(freq[s.charAt(mid)- 'a']<k){
                int midnext = mid+1;
                if(midnext<end && freq[s.charAt(midnext) - 'a']<k ){
                    midnext++;
                }
                return Math.max(helper(s,start,mid,k),helper(s,midnext,end,k));
            }
            }
            return end-start;
    }
        
        
    
}
