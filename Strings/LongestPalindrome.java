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
