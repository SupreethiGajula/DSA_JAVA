//time complexity-O(n^2)
//space complexity-O(1)


import java.util.*;

class Solution {
    public String makeLargestSpecial(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        List<String> parts = new ArrayList<>();
        int count = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            count += (s.charAt(i) == '1') ? 1 : -1;

            // When count becomes 0, we found a special substring
            if (count == 0) {
                // Recursively process the inner substring
                String inner = makeLargestSpecial(s.substring(start + 1, i));
                parts.add("1" + inner + "0");
                start = i + 1;
            }
        }

        // Sort in descending lexicographical order
        Collections.sort(parts, Collections.reverseOrder());

        // Combine all parts
        StringBuilder result = new StringBuilder();
        for (String part : parts) {
            result.append(part);
        }

        return result.toString();
    }
}
