public class Check_SortedArray {
    public static void main(String[]args){
        int arr[] = {1,2,3,4,5};
        boolean flag = true;
        for(int i=0;i<arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    flag = false;
                }
            }   
            }
            if(flag){
                System.out.println("array is sorted in ascending order");
            }else{
                System.out.println("array is not sorted");
            }
            
        
    }
    
}
