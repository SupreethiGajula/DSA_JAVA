import java.util.*;

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        // Sort boxTypes by number of units per box in descending order
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

        int totalUnits = 0;

        for (int[] box : boxTypes) {
            int boxesToTake = Math.min(truckSize, box[0]); // Pick as many as possible
            totalUnits += boxesToTake * box[1];            // Add units
            truckSize -= boxesToTake;                      // Reduce truck capacity

            if (truckSize == 0) break;                     // Truck is full
        }

        return totalUnits;
    }
}
