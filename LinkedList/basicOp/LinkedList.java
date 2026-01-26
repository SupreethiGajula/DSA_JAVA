package LinkedList.basicOp;

public class LinkedList {
    Node head;

    public void insert(int data){//data is the value that is to be inserted
            Node newNode = new Node();//creating a new node for data to be inserted inside
            newNode.data = data;//assigning the data to the new node
            newNode.next = null;//initializing the next pointer of the new node to null

            if(head == null){
                head = newNode;//if the list is empty, the new node is the head
            }else{
                Node tempNode = new Node();
                tempNode = head;//create a temp node pointing to head and traverse the linked list
                while(tempNode.next!=null){
                    tempNode = tempNode.next;
                }
                tempNode.next = newNode;

            }
    }
    public void show(){
        Node tempNode = new Node();
        tempNode = head;
        while(tempNode!=null){//here there might be confsion if you use tempNode.next!=null and tempNode!=null
            System.out.print(tempNode.data+" ");
            tempNode = tempNode.next;

    }
    // System.out.println(tempNode.data);
    
}
    public void insertAtStart(int data){
        Node newNode = new Node();
        newNode.next = head;
        head = newNode;

    }
    public void insertAtIndex(int index,int data){
        if(index==0){
            insertAtStart(data);
        }else{
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        Node tempNode = new Node();
        tempNode = head;
        for(int i=0;i<index-1;i++){
            tempNode = tempNode.next;
        }
        newNode.next = tempNode.next;
        tempNode.next = newNode;
    }
    }
    public void insertAtEnd(int data){

        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        Node tempNode = new Node();
        tempNode = head;
        while(tempNode.next!=null){
            tempNode = tempNode.next;
    }
    tempNode.next = newNode;
}

    public void deleteFirst(){
        head = head.next;

    }
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
    
        if (head.next == null) {
            head = null; // Only one element
            return;
        }
    
        Node tempNode = head;
        while (tempNode.next.next != null) {
            tempNode = tempNode.next; // Move to the second-last node
        }
    
        tempNode.next = null; // Remove the last node
    }
    public void deleteAtIndex(int index){
        if(index==0){
            head = head.next;
        }
        else{
            Node tempNode = head;
            for(int i=0;i<index-1;i++){
                tempNode = tempNode.next;
             }
             tempNode.next = tempNode.next.next;

             }
            }

        }






