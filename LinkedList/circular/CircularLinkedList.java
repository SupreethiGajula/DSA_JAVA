package LinkedList.circular;

public class CircularLinkedList {
    Node head;
    Node tail;

    public void insertAtStart(int data){
        Node newNode = new Node();
        newNode.data=data;
        if(head==null){
            head=newNode;
            tail=newNode;
            newNode.next=head;
        }else{
            newNode.next=head;
            head=newNode;
            tail.next=head;
        }

    }
    public void insertAtEnd(int data){
        Node newNode = new Node();
        newNode.data=data;
        Node temp = new Node();
        temp=head;
        if(head == null){
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }
        else{

        while(temp.next!=head){
            temp = temp.next;
        }
        temp.next = newNode;
        tail = newNode;
        tail.next = head;
    }
    }
    public void insertAtIndex(int data,int index){
        Node newNode = new Node();
        newNode.data = data;
        Node temp = new Node();
        temp = head;
        int count=0;
        // do ths to check if the given index is greater then the length of the list
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
    
        if (index > count) {
            System.out.println("Index out of bounds.");
            return;
        }
        if(index == 0){
            insertAtStart(data);
        }else{
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            if (temp == tail) {
                tail = newNode;
            }

        }
    }
    public void printList(){
        Node temp=head;
        System.out.print(temp.data+" ");// we need to handle this because unlike other linked lists the stopping condition is not null it is head 

        while(temp.next!=head){
            
            temp=temp.next;
            System.out.print(temp.data+" ");

        }
    }
    public void deleteAtStart(){
        if(head == null){
            System.out.println("List is empty");
        }
        else if(head.next == null){
            head=null;
            tail=null;
        }
        else{
            tail.next = head.next;
            head.next = null;
            head = tail.next;
           
        }

    }
    public void deleteAtEnd(){
        Node temp = head;
        if(head ==  null){
            System.out.println("List is empty");
        }else if(head.next == null){
            head = null;
            tail = null;
        }else{
            while(temp.next.next!=head){
                temp=temp.next;
            }
            temp.next = head;
        }

    }
    public void deleteAtIndex(int index){
        Node temp=head;
        int count=0;
        // do ths to check if the given index is greater then the length of the list
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
    
        if (index > count) {
            System.out.println("Index out of bounds.");
            return;
        }
        if(index ==0){
            deleteAtStart();
        }else if(index == count-1){
            deleteAtEnd();
        }else{
            for(int i=0;i<index-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }

    }
}
