package LinkedList.nthnodefrombehind;
//o(n)-time
//o(1)-space
public class NnodeFromBehindOptimal {
    Node head;
    Node first;
    Node second;
    
    public int func(int k){
        if(head==null||k<=0){
            System.out.println("enter a valid index");
            return -1;
        }
        first = head;
        second = head;
        for(int i=0;i<k;i++){
            first = first.next;
        }
        while(first!=null){
            first = first.next;
            second = second.next;
        }
        return second.data;
    }
    public void insert(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

}
