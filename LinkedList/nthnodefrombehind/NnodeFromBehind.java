package LinkedList.nthnodefrombehind;
//this is the o(n) solution with traversal
public class NnodeFromBehind {
    Node head = null;

    public int func(int k){
        Node temp = head;
        int length =0 ;

        while(temp!=null){
            length++;
            temp=temp.next;
        }
        if(k>length || k<0){
            System.out.println("enter a valid index");
            return -1;
        }
        temp = head;
        for(int i=0;i<length-k;i++){
            temp = temp.next;
        }
        return temp.data;
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
