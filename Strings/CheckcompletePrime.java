import java.util.Arrays;
import java.util.List;

class Solution {
    public boolean completePrime(int num) {
        List<Integer> singlePrime = Arrays.asList(2,3,5,7);
        
        // Single-digit number
        if (num < 10) {
            return singlePrime.contains(num);
        }
        
        String str = String.valueOf(num);
        int n = str.length();
        
        // Check all prefixes
        for (int i = 1; i <= n; i++) {
            int prefix = Integer.parseInt(str.substring(0, i));
            if (!isPrime(prefix)) return false;
        }
        
        // Check all suffixes
        for (int i = 0; i < n; i++) {
            int suffix = Integer.parseInt(str.substring(i));
            if (!isPrime(suffix)) return false;
        }
        
        return true;
    }
    
    // Helper function to check if a number is prime
    private boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i*i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}
