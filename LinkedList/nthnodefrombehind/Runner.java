package LinkedList.nthnodefrombehind;

public class Runner {
    public static void main(String[] args) {
        
    
    NnodeFromBehindOptimal l_list = new NnodeFromBehindOptimal();
    l_list.insert(10);
    l_list.insert(20);
    l_list.insert(30);
    l_list.insert(40);
    l_list.insert(50);
    l_list.insert(60);

    System.out.println(l_list.func(4));


    
    }

}
