// import java.util.*;

// class Router {

//     Queue<int[]> routerq;
//     int memoryLimit;

//     public Router(int memoryLimit) {
//         this.memoryLimit = memoryLimit;
//         routerq = new LinkedList<>();
//     }
    
//     public boolean addPacket(int source, int destination, int timestamp) {

//         int[] newPacket = new int[]{source, destination, timestamp};

//         for (int[] p : routerq) {
//             if (p[0] == source &&
//                 p[1] == destination &&
//                 p[2] == timestamp) {
//                 return false;
//             }
//         }

//         if (routerq.size() == memoryLimit) {
//             routerq.poll();
//         }

//         routerq.add(newPacket);
//         return true;
//     }
    
//     public int[] forwardPacket() {
//         if (!routerq.isEmpty()) {
//             return routerq.poll();
//         }
//         return new int[0];
//     }
    
//     public int getCount(int destination,
//                         int startTime,
//                         int endTime) {

//         int count = 0;

//         for (int[] p : routerq) {
//             if (p[1] == destination &&
//                 p[2] >= startTime &&
//                 p[2] <= endTime) {
//                 count++;
//             }
//         }

//         return count;
//     }
// }

/**
 * Your Router object will be instantiated and called as such:
 * Router obj = new Router(memoryLimit);
 * boolean param_1 = obj.addPacket(source,destination,timestamp);
 * int[] param_2 = obj.forwardPacket();
 * int param_3 = obj.getCount(destination,startTime,endTime);
 */





////optimal solution ///////////
import java.util.*;

class Router {

    Queue<int[]> queue;
    Set<String> seen;
    Map<Integer, List<Integer>> destMap;
    int memoryLimit;

    public Router(int memoryLimit) {
        this.memoryLimit = memoryLimit;
        queue = new LinkedList<>();
        seen = new HashSet<>();
        destMap = new HashMap<>();
    }

    // Unique identity key
    private String getKey(int s, int d, int t) {
        return s + "#" + d + "#" + t;
    }

    // ADD PACKET
    public boolean addPacket(int source,
                             int destination,
                             int timestamp) {

        String key = getKey(source,
                            destination,
                            timestamp);

        // Duplicate check
        if (seen.contains(key)) {
            return false;
        }

        // Memory full → remove oldest
        if (queue.size() == memoryLimit) {

            int[] old = queue.poll();

            String oldKey =
                getKey(old[0], old[1], old[2]);

            seen.remove(oldKey);

            // Remove timestamp from map
            List<Integer> list =
                destMap.get(old[1]);

            list.remove(0);

            if (list.isEmpty()) {
                destMap.remove(old[1]);
            }
        }

        // Add new packet
        int[] packet =
            new int[]{source, destination, timestamp};

        queue.add(packet);
        seen.add(key);

        destMap
            .computeIfAbsent(destination,
                             k -> new ArrayList<>())
            .add(timestamp);

        return true;
    }

    // FORWARD PACKET
    public int[] forwardPacket() {

        if (queue.isEmpty()) {
            return new int[0];
        }

        int[] packet = queue.poll();

        String key =
            getKey(packet[0],
                   packet[1],
                   packet[2]);

        seen.remove(key);

        // Update map
        List<Integer> list =
            destMap.get(packet[1]);

        list.remove(0);

        if (list.isEmpty()) {
            destMap.remove(packet[1]);
        }

        return packet;
    }

    // GET COUNT
    public int getCount(int destination,
                        int startTime,
                        int endTime) {

        if (!destMap.containsKey(destination)) {
            return 0;
        }

        List<Integer> list =
            destMap.get(destination);

        int count = 0;

        for (int t : list) {
            if (t >= startTime &&
                t <= endTime) {
                count++;
            }
        }

        return count;
    }
}
