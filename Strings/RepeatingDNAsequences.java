// The DNA sequence is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', and 'T'.

// For example, "ACGAATTCCG" is a DNA sequence.
// When studying DNA, it is useful to identify repeated sequences within the DNA.

// Given a string s that represents a DNA sequence, return all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule. You may return the answer in any order.

 class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int n = s.length();
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        if (n < 10) return list;

        for (int l = 0; l <= n - 10; l++) {
            String sub = s.substring(l, l + 10);
            map.put(sub, map.getOrDefault(sub, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                list.add(entry.getKey());
            }
        }

        return list;
    }
}
