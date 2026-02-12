/*Time: O(n³) – generating all substrings O(n²) + palindrome check O(n)

Space: O(n) – for substring creation and reverse string
*/
//BruteForce Approach
//best for small strings but not good for large strings
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String longest = "";

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String sub = s.substring(i, j + 1);
                if (isPalindrome(sub) && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }

        return longest;
    }

    private boolean isPalindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
}


/*For bigger Strings the above method is not feasible so the below method - expandaroundcenter approach
Every palindromic string will have a center we check from that center only by creating a helper method for that*/
//time complexity:o(n^2) and space complexity o(1)
class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;  // longest palindrome indices

        for (int i = 0; i < s.length(); i++) {
            // Odd-length palindrome
            int len1 = expandAroundCenter(s, i, i);
            // Even-length palindrome
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);

            if (len > end - start) {
                // Update start and end indices
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // Length of palindrome
    }
}

