package LinkedList.unrolled;

public class ULL {
    Node head = new Node();

    //insert at end
    public void insertAtEnd(int data){
       Node temp = head;
       while(temp.next!=null){
        temp =temp.next;
       }
       if(temp.numElements == Node.NODE_CAPACITY){
        Node newNode = new Node();
        newNode.elements[newNode.numElements]=data;
        newNode.numElements++;
        temp.next = newNode;
       }else{
        temp.elements[temp.numElements]=data;
        temp.numElements++;
       }
    }
    public void insertAtIndex(int data, int index) {
        if (head == null) {
            head = new Node();
            head.elements[0] = data;
            head.numElements++;
            return;
        }
    
        Node temp = head;
        int count = 0;
    
        while (temp != null) {
            if (count + temp.numElements >= index) {
                break;
            }
            count += temp.numElements;
            temp = temp.next;
        }
    
        int localIndex = index - count;
    
        // Case 1: if there's space in this node
        if (temp.numElements < Node.NODE_CAPACITY) {
            for (int i = temp.numElements - 1; i >= localIndex; i--) {
                temp.elements[i + 1] = temp.elements[i];
            }
            temp.elements[localIndex] = data;
            temp.numElements++;
            return;
        }
    
        // Case 2: Node is full — split the node
        Node newNode = new Node();
        int moveCount = temp.numElements / 2;
    
        for (int i = 0; i < moveCount; i++) {
            newNode.elements[i] = temp.elements[temp.numElements - moveCount + i];
        }
    
        newNode.numElements = moveCount;
        temp.numElements -= moveCount;
    
        newNode.next = temp.next;
        temp.next = newNode;
    
        if (localIndex <= temp.numElements) {
            for (int i = temp.numElements - 1; i >= localIndex; i--) {
                temp.elements[i + 1] = temp.elements[i];
            }
            temp.elements[localIndex] = data;
            temp.numElements++;
        } else {
            int newLocalIndex = localIndex - temp.numElements;
            for (int i = newNode.numElements - 1; i >= newLocalIndex; i--) {
                newNode.elements[i + 1] = newNode.elements[i];
            }
            newNode.elements[newLocalIndex] = data;
            newNode.numElements++;
        }
    }

    public void deleteAtIndex(int index){
        if(head == null){
            return;
        }
        Node temp = head;
        int count=0;
        while(temp!=null){
            if(count+temp.numElements>index){
                break;
            }
            count = count+temp.numElements;
            temp = temp.next;

        }
        int localIndex = index-count;
        for(int i=localIndex;i<temp.numElements-1;i++){
            temp.elements[i] = temp.elements[i+1];
        }
        temp.numElements--;
    }
    
    public void printList(){
        Node temp = head;
        while(temp!=null){
            for(int i=0;i<temp.numElements;i++){
            System.out.print(temp.elements[i]+" ");
            }
            temp = temp.next;
        }
        System.out.println();

    }

}
