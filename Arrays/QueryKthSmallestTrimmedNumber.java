// You are given a 0-indexed array of strings nums, where each string is of equal length and consists of only digits.

// You are also given a 0-indexed 2D integer array queries where queries[i] = [ki, trimi]. For each queries[i], you need to:

// Trim each number in nums to its rightmost trimi digits.
// Determine the index of the kith smallest trimmed number in nums. If two trimmed numbers are equal, the number with the lower index is considered to be smaller.
// Reset each number in nums to its original length.
// Return an array answer of the same length as queries, where answer[i] is the answer to the ith query.

// Note:

// To trim to the rightmost x digits means to keep removing the leftmost digit, until only x digits remain.
// Strings in nums may contain leading zeros

class Solution {
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int n = queries.length;
        int []res = new int[n];
        for(int qi=0;qi<n;qi++){
            int k = queries[qi][0];
            int trim = queries[qi][1]; 

            String [][] trimmedArr = new String[nums.length][2];
            for(int i=0;i<nums.length;i++){
                String trimmed = nums[i].substring(nums[i].length()-trim);
                trimmedArr[i][0] = trimmed;
                trimmedArr[i][1] = String.valueOf(i);
            }
            sort(trimmedArr);
            res[qi] = Integer.parseInt(trimmedArr[k-1][1]);

        }
        return res;
    }
    private void sort(String [][] arr){
        Arrays.sort(arr,(a,b)->{
            int comp = a[0].compareTo(b[0]);
            if(comp!=0){
                return comp;
            }
            return Integer.parseInt(a[1]) - Integer.parseInt(b[1]);
        });
    }
}
