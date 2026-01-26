package LinkedList.basicOp;

public class DoublyLinked {
    DoublyLinkedNode head;

    public void insertAtStart(int data){
        DoublyLinkedNode newNode = new DoublyLinkedNode();
        newNode.data = data;
        
        if(head!=null){
        newNode.next = head;
        head.prev = newNode;
        }
        head = newNode;


    }
    public void insertAtEnd(int data){
        DoublyLinkedNode newNode = new DoublyLinkedNode();
        newNode.data = data;    
        DoublyLinkedNode temp = new DoublyLinkedNode();
        temp= head;
        if(head==null){
            insertAtStart(data);
        }else{
            while(temp.next!=null){
                temp = temp.next;

        }
        temp.next = newNode;
        newNode.prev = temp;

        }
    }
    public void insertAtIndex(int data,int index){
        DoublyLinkedNode newNode = new DoublyLinkedNode();
        newNode.data = data;
        if(head == null){
            insertAtStart(data);
        }
        else{
            DoublyLinkedNode temp = head;
            for(int i=0;i<index-1;i++){
                temp = temp.next;
            }
            temp.next.prev = newNode;
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next = newNode;


        }
    }
    public void deleteAtStart(){
            if(head==null){
                System.out.println("List is empty");
        }
        else if(head.next==null){
            head = null;
        }
        else{
            head = head.next;
            head.prev = null;
        }
    }
    public void deleteAtEnd(){
        if(head==null){
            System.out.println("List is empty");
    }else if(head.next == null){
        head = null;
    }else{
        DoublyLinkedNode temp = head;
        while(temp.next.next!=null){
            temp=temp.next;
            }
        temp.next = null;
        }
    }
    public void deleteAtIndex(int index) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
    
        if (index == 0) {
            deleteAtStart();
            return;
        } else if (index == size() - 1) {
            deleteAtEnd();
            return;
        } else {
            DoublyLinkedNode temp = head;
    
            // Move to (index - 1)th node
            for (int i = 0; i < index - 1; i++) {
                if (temp == null || temp.next == null) {
                    System.out.println("Index out of bounds");
                    return;
                }
                temp = temp.next;
            }
    
            DoublyLinkedNode nodeToDelete = temp.next;
    
            if (nodeToDelete == null || nodeToDelete.next == null) {
                System.out.println("Index out of bounds");
                return;
            }
    
            // Re-link nodes
            temp.next = nodeToDelete.next;
            nodeToDelete.next.prev = temp;
    
            // Optional cleanup
            nodeToDelete.next = null;
            nodeToDelete.prev = null;
        }
    }  
    public void display(){
        DoublyLinkedNode temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;

    }
    }
    public int size() {
        int count = 0;
        DoublyLinkedNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
