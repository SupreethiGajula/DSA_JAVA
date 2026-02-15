// time complexity = o(n*m) too much

//class Solution {
//     public ListNode modifiedList(int[] nums, ListNode head) {

//         for (int i : nums) {

//             while (head != null && head.val == i) {
//                 head = head.next;
//             }

//             ListNode temp = head;

//             while (temp != null && temp.next != null) {

//                 if (temp.next.val == i) {
//                     temp.next = temp.next.next;
//                 } else {
//                     temp = temp.next;
//                 }
//             }
//         }

//         return head;
//     }
// }

//time complexity o(n+m)
//space complexity o(n)

class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {

        // Store nums in HashSet
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        // Dummy node to handle head deletion
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode curr = dummy;

        while (curr.next != null) {

            if (set.contains(curr.next.val)) {
                curr.next = curr.next.next;   // delete
            } else {
                curr = curr.next;             // move
            }
        }

        return dummy.next;
    }
}
