/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0||head == null || head.next == null){
            return head;
        }
        int length = 1;
            ListNode temp = head;
            while(temp.next!=null){
                length++;
                temp = temp.next;
            }
            temp.next = head;
            k = k%length;
            int stepstotail = length-k;
            ListNode newtail = head;
            for(int i=1;i<stepstotail;i++){
                newtail = newtail.next;
            }
            ListNode newHead = newtail.next;
            newtail.next = null;
          
        return newHead;
    }

}
