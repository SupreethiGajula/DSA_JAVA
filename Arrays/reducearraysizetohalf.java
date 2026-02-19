class Solution {
    public int minSetSize(int[] arr) {

        // Step 1: Frequency map
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Put frequencies into list
        List<Integer> freq = new ArrayList<>(map.values());

        // Step 3: Sort descending
        Collections.sort(freq, Collections.reverseOrder());

        int removed = 0;
        int count = 0;
        int target = arr.length / 2;

        // Step 4: Greedy removal
        for (int f : freq) {
            removed += f;
            count++;

            if (removed >= target) {
                return count;
            }
        }

        return count;
    }
}
