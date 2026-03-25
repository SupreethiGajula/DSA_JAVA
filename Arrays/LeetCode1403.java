class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        // Sort ascending
        Arrays.sort(nums);

        List<Integer> res = new ArrayList<>();
        int currSum = 0;

        // Traverse from end (largest elements first)
        for (int i = nums.length - 1; i >= 0; i--) {
            currSum += nums[i];
            res.add(nums[i]);

            if (currSum > totalSum - currSum) {
                break; // ✅ stop as soon as condition is satisfied
            }
        }

        return res;
    }
}
