import java.util.*;
public class BasicArrayPrint{
    public static void main(String[] args) {
        System.out.println("enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        String arr[] = new String[size];
        String name = null;
        for(int i = 0;i<size;i++){
            System.out.println("enter name for arr["+i+"]");
            name = sc.nextLine();
            arr[i] = name;
        } 
        for(int j=0;j<size;j++){
            System.out.print(arr[j]+" ");
        }
        sc.close();
        
     }
}