// A binary watch has 4 LEDs on the top to represent the hours (0-11), and 6 LEDs on the bottom to represent the minutes (0-59).
//Each LED represents a zero or one, with the least significant bit on the right.
//Given an integer turnedOn which represents the number of LEDs that are currently on (ignoring the PM), return all possible times the watch could represent. You may return the answer in any order.

//The hour must not contain a leading zero.
class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();
        
        for (int hour = 0; hour < 12; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                if (Integer.bitCount(hour) + Integer.bitCount(minute) == turnedOn) {
                    result.add(String.format("%d:%02d", hour, minute));
                }
            }
        }
        
        return result;
    }
}
/*What Does Integer.bitCount(n) Do?

It counts how many 1s are in the binary (base-2) representation of a number.

Example 1:
int x = 5;
System.out.println(Integer.bitCount(x));


Binary of 5:

5 = 101


There are 2 ones, so output is:

2

Example 2:
int x = 7;
System.out.println(Integer.bitCount(x));


Binary of 7:

7 = 111


There are 3 ones, so output is:

3*/
