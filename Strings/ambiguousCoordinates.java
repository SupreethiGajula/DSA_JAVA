class Solution {

    public List<String> ambiguousCoordinates(String s) {
        List<String> result = new ArrayList<>();
        
        // remove parentheses
        s = s.substring(1, s.length() - 1);

        for (int i = 1; i < s.length(); i++) {
            String left = s.substring(0, i);
            String right = s.substring(i);

            List<String> leftParts = generate(left);
            List<String> rightParts = generate(right);

            for (String l : leftParts) {
                for (String r : rightParts) {
                    result.add("(" + l + ", " + r + ")");
                }
            }
        }

        return result;
    }

    private List<String> generate(String s) {
        List<String> list = new ArrayList<>();

        // integer case
        if (isValidInteger(s)) {
            list.add(s);
        }

        // decimal cases
        for (int i = 1; i < s.length(); i++) {
            String left = s.substring(0, i);
            String right = s.substring(i);

            if (isValidInteger(left) && isValidDecimal(right)) {
                list.add(left + "." + right);
            }
        }

        return list;
    }

    private boolean isValidInteger(String s) {
        if (s.length() > 1 && s.startsWith("0")) return false;
        return true;
    }

    private boolean isValidDecimal(String s) {
        if (s.endsWith("0")) return false;
        return true;
    }
}
