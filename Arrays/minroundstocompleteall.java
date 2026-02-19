class Solution {
    public int minimumRounds(int[] tasks) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        // Count frequencies
        for (int t : tasks) {
            freq.put(t, freq.getOrDefault(t, 0) + 1);
        }

        int rounds = 0;

        // Calculate rounds
        for (int count : freq.values()) {

            if (count == 1) {
                return -1; // impossible
            }

            rounds += count / 3;

            if (count % 3 != 0) {
                rounds++;
            }
        }

        return rounds;
    }
}

        
    
