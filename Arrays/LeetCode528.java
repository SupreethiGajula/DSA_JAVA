import java.util.*;

class Solution {

    int[] prefix;
    int total;
    Random rand;

    public Solution(int[] w) {
        int n = w.length;
        prefix = new int[n];
        
        prefix[0] = w[0];
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i - 1] + w[i];
        }
        
        total = prefix[n - 1];
        rand = new Random();
    }
    
    public int pickIndex() {
        int r = rand.nextInt(total) + 1; // 1 to total
        
        int left = 0, right = prefix.length - 1;
        
        // binary search for smallest index where prefix[i] >= r
        while(left < right){
            int mid = left + (right - left) / 2;
            
            if(prefix[mid] < r){
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        return left;
    }
}
