// Reserve → poll() the smallest → O(log n)

// Unreserve → add() back → O(log n)

import java.util.PriorityQueue;

class SeatManager {
    private PriorityQueue<Integer> pq;

    public SeatManager(int n) {
        pq = new PriorityQueue<>();
        for (int i = 1; i <= n; i++) {
            pq.add(i);
        }
    }

    public int reserve() {
        return pq.poll(); // smallest available seat
    }

    public void unreserve(int seatNumber) {
        pq.add(seatNumber);
    }
}
